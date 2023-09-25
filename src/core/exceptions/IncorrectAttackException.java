package core.exceptions;

import static core.Constants.Entity.MAX_ATTACK_POINTS;
import static core.Constants.Entity.MIN_ATTACK_POINTS;

public class IncorrectAttackException extends IllegalArgumentException {
    public IncorrectAttackException() {
        super("Значение атаки должно лежать от " + MIN_ATTACK_POINTS + " до " + MAX_ATTACK_POINTS + "!");
    }
}
