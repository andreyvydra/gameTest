package entities;

import static core.Constants.Monster.*;

public class Monster extends Entity {
    public Monster(String name) {
        super(
                name,
                DEFAULT_MIN_DAMAGE_POINTS,
                DEFAULT_MAX_DAMAGE_POINTS,
                DEFAULT_ATTACK_POINTS,
                DEFAULT_DEFENSE_POINTS,
                DEFAULT_HEALTH_POINTS
        );
    }

}
