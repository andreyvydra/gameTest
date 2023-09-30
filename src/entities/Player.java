package entities;


import static core.Constants.Player.*;

public class Player extends Entity {
    public Player(String name) {
        super(
                name,
                DEFAULT_MIN_DAMAGE_POINTS,
                DEFAULT_MAX_DAMAGE_POINTS,
                DEFAULT_ATTACK_POINTS,
                DEFAULT_DEFENSE_POINTS,
                DEFAULT_HEALTH_POINTS
        );
        lifeCounter = DEFAULT_LIVES_COUNT;
    }

}
