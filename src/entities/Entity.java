package entities;

import core.exceptions.*;

import static core.Constants.Entity.*;
import static core.Constants.Game.*;
import static java.lang.Math.*;

public class Entity implements Attacking, Defending {
    protected byte attackPoints;
    protected int maxDamagePoints;
    protected int minDamagePoints;
    protected byte defensePoints;
    protected int maxHealthPoints;
    protected int healthPoints;
    protected byte lifeCounter = DEFAULT_LIVES_COUNT;
    protected int minAttackModifier = MIN_ATTACK_MODIFIER;
    protected int threshold = THRESHOLD;

    protected boolean isAlive = true;

    public Entity() {
        maxDamagePoints = DEFAULT_MAX_DAMAGE_POINTS;
        minDamagePoints = DEFAULT_MIN_DAMAGE_POINTS;
        attackPoints = DEFAULT_ATTACK_POINTS;
        defensePoints = DEFAULT_DEFENSE_POINTS;
        healthPoints = DEFAULT_HEALTH_POINTS;
        maxHealthPoints = DEFAULT_HEALTH_POINTS;
    }

    public Entity(int minDamagePoints,
                  int maxDamagePoints,
                  byte attackPoints,
                  byte defensePoints,
                  int healthPoints) throws IllegalArgumentException {
        if (maxDamagePoints < MIN_DAMAGE_POINTS || minDamagePoints < MIN_DAMAGE_POINTS) {
            throw new IncorrectDamageException();
        }
        if (maxDamagePoints < minDamagePoints) {
            throw new RangeDamageException();
        }
        if (defensePoints > MAX_DEFENSE_POINTS || defensePoints < MIN_DEFENSE_POINTS) {
            throw new IncorrectDefenseException();
        }
        if (attackPoints > MAX_ATTACK_POINTS || attackPoints < MIN_ATTACK_POINTS) {
            throw new IncorrectAttackException();
        }
        if (healthPoints < MIN_HEALTH_POINTS) {
            throw new IncorrectHealthException();
        }

        this.maxDamagePoints = maxDamagePoints;
        this.minDamagePoints = minDamagePoints;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.healthPoints = healthPoints;
        this.maxHealthPoints = healthPoints;
    }

    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public void attack(Entity somebody) {
        int attackModifier = Math.max(attackPoints - somebody.defensePoints + 1, minAttackModifier);
        boolean isAttacking = false;
        for (int i = 0; i < attackModifier; i++) {
            if (random() * MAX_DICE_VALUE >= threshold) {
                isAttacking = true;
            }
        }
        if (isAttacking) {
            somebody.defense(this);
        }
    }

    @Override
    public void defense(Entity somebody) {
        long damage = round(random() * (somebody.maxDamagePoints - somebody.minDamagePoints) +
                somebody.minDamagePoints);
        healthPoints -= damage;
        if (healthPoints <= 0) {
            lifeCounter--;
            if (lifeCounter < MIN_LIVES_COUNT) {
                isAlive = false;
            } else {
                healthPoints = (int) ceil(0.3 * maxHealthPoints);
            }
        }
    }

    @Override
    public String toString() {
        return "Существо {" +
                "урон=" + minDamagePoints + '-' + maxDamagePoints +
                ", атака=" + attackPoints +
                ", защита=" + defensePoints +
                ", здоровье=" + healthPoints +
                "}";
    }
}
