package core.exceptions;

import static core.Constants.Game.*;

/**
 * Этот класс ошибки служит для того, чтобы оповещать
 * о некорректном значении урона, который должен быть больше, чем
 * MIN_DAMAGE_POINTS
 *
 * @see entities.Entity
 * @see core.Constants.Game
 */
public class IncorrectDamageException extends IllegalArgumentException {
    public IncorrectDamageException() {
        super("Значение атаки должно лежать от " + MIN_DAMAGE_POINTS + " до!");
    }
}
