package entities;

import static core.Constants.Player.*;

public class Player extends Entity {
    public Player() {
        super(
                DEFAULT_MIN_DAMAGE_POINTS,
                DEFAULT_MAX_DAMAGE_POINTS,
                DEFAULT_ATTACK_POINTS,
                DEFAULT_DEFENSE_POINTS,
                DEFAULT_HEALTH_POINTS
        );
        lifeCounter = DEFAULT_LIVES_COUNT;
    }

    @Override
    public String toString() {
        return "Игрок {" +
                "урон=" + minDamagePoints + '-' + maxDamagePoints +
                ", атака=" + attackPoints +
                ", защита=" + defensePoints +
                ", здоровье=" + healthPoints +
                "}";
    }
}
