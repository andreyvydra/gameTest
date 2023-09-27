package core.exceptions;

import static core.Constants.Game.MIN_ATTACK_POINTS;

public class IncorrectAttackException extends IllegalArgumentException {
    public IncorrectAttackException() {
        super("Значение должно быть больше, чем " + MIN_ATTACK_POINTS);
    }
}
