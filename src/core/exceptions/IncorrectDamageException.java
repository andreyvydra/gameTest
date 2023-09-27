package core.exceptions;

import static core.Constants.Game.MAX_ATTACK_POINTS;
import static core.Constants.Game.MIN_ATTACK_POINTS;

public class IncorrectDamageException extends IllegalArgumentException {
    public IncorrectDamageException() {
        super("Значение атаки должно лежать от " + MIN_ATTACK_POINTS + " до " + MAX_ATTACK_POINTS + "!");
    }
}
