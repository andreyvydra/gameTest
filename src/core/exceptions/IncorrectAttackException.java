package core.exceptions;

import static core.Constants.Game.MAX_ATTACK_POINTS;
import static core.Constants.Game.MIN_ATTACK_POINTS;

/**
 * Этот класс ошибки служит для того, чтобы оповещать
 * о некорректном значении атаки, который должен быть больше, чем
 * MIN_ATTACK_POINTS и меньше, чем MAX_ATTACK_POINTS
 *
 * @see entities.Entity
 * @see core.Constants.Game
 */
public class IncorrectAttackException extends IllegalArgumentException {
    public IncorrectAttackException() {
        super("Значение должно быть больше, чем " + MIN_ATTACK_POINTS +
                "и меньше, чем " + MAX_ATTACK_POINTS);
    }
}
