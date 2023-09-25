import core.exceptions.IncorrectAttackException;
import core.exceptions.IncorrectDefenseException;
import core.exceptions.IncorrectHealthException;
import core.exceptions.RangeAttackException;

import static core.Constants.Entity.*;

public class Entity {
    protected byte maxAttackPoints;
    protected byte minAttackPoints;
    protected byte defensePoints;
    protected int healthPoints;

    public Entity() {
        maxAttackPoints = MAX_ATTACK_POINTS;
        minAttackPoints = MAX_ATTACK_POINTS;
        defensePoints = MAX_DEFENSE_POINTS;
        healthPoints = DEFAULT_HEALTH_POINTS;
    }

    public Entity(byte minAttackPoints, byte maxAttackPoints, byte defensePoints, int healthPoints) throws IllegalArgumentException {
        if (maxAttackPoints > MAX_ATTACK_POINTS || maxAttackPoints < MIN_ATTACK_POINTS) {
            throw new IncorrectAttackException();
        }
        if (minAttackPoints > MAX_DEFENSE_POINTS || minAttackPoints < MIN_ATTACK_POINTS) {
            throw new IncorrectAttackException();
        }
        if (maxAttackPoints < minAttackPoints) {
            throw new RangeAttackException();
        }
        if (defensePoints > MAX_DEFENSE_POINTS || defensePoints < MIN_DEFENSE_POINTS) {
            throw new IncorrectDefenseException();
        }
        if (healthPoints < MIN_HEALTH_POINTS) {
            throw new IncorrectHealthException();
        }

        this.maxAttackPoints = maxAttackPoints;
        this.minAttackPoints = minAttackPoints;
        this.defensePoints = defensePoints;
        this.healthPoints = healthPoints;
    }

    @Override
    public String toString() {
        return "Существо {" +
                "урон=" + minAttackPoints + '-' + maxAttackPoints +
                ", защита=" + defensePoints +
                ", здоровье=" + healthPoints +
                "}";
    }
}
