package entities;

import core.GameMessagesOutput;
import core.exceptions.*;

import static core.Constants.Entity.*;
import static core.Constants.Game.*;
import static java.lang.Math.*;

/**
 * Класс существа, который определяет общий метод защиты, атаки
 * для потомков класса. Также определяет конструктор с
 * обработкой некорректных аргументов
 *
 * @see Player
 * @see Monster
 * @see core.Constants.Entity
 */
public class Entity implements Attacking, Defending {
    protected String name;
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
        name = Entity.class.getSimpleName();
    }

    public Entity(String name,
                  int minDamagePoints,
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
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return isAlive;
    }


    /**
     * Успешность атаки определяется с помощью модификатора атаки,
     * максимально выброшенного значения на кубике и проходного значения.
     *
     * @param somebody - существо, которое будет атаковано
     */
    @Override
    public void attack(Entity somebody) {
        if (!isAlive) return;
        int attackModifier = Math.max(attackPoints - somebody.defensePoints + 1, minAttackModifier);
        int dice = 0;
        for (int i = 0; i < attackModifier; i++) {
            int currentDice = (int) ceil(random() * MAX_DICE_VALUE);
            dice = Math.max(dice, currentDice);
        }
        if (dice >= threshold) {
            GameMessagesOutput.printAttackMessage(this, somebody, dice);
            somebody.defense(this);
        } else {
            GameMessagesOutput.printMissMessage(this, somebody, dice);
        }
    }

    /**
     * Метод обрабатывает урон, нанесённый существу
     *
     * @param somebody - кто атаковал
     */
    @Override
    public void defense(Entity somebody) {
        int damage = (int) round(random() * (somebody.maxDamagePoints - somebody.minDamagePoints) +
                somebody.minDamagePoints);
        healthPoints -= damage;
        GameMessagesOutput.printDefenseMessage(this, somebody, damage);
        if (healthPoints <= 0) {
            lifeCounter--;
            if (lifeCounter < MIN_LIVES_COUNT) {
                GameMessagesOutput.printDeathMessage(this);
                isAlive = false;
            } else {
                int newHp = (int) ceil(0.3 * maxHealthPoints);
                GameMessagesOutput.printRebornMessage(this, newHp);
                healthPoints = newHp;
            }
        }
    }

    @Override
    public String toString() {
        return name + " {" +
                "урон=" + minDamagePoints + '-' + maxDamagePoints +
                ", атака=" + attackPoints +
                ", защита=" + defensePoints +
                ", здоровье=" + healthPoints +
                "}";
    }
}
