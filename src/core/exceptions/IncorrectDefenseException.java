package core.exceptions;

import static core.Constants.Game.MAX_DEFENSE_POINTS;
import static core.Constants.Game.MIN_DEFENSE_POINTS;

/**
 * Этот класс ошибки служит для того, чтобы оповещать
 * о некорректном значении защиты, который должен быть больше, чем
 * MIN_DEFENSE_POINTS и меньше, чем MAX_DEFENSE_POINTS
 *
 * @see entities.Entity
 * @see core.Constants.Game
 */
public class IncorrectDefenseException extends IllegalArgumentException {
    public IncorrectDefenseException() {
        super("Значение защиты должно лежать от " + MIN_DEFENSE_POINTS + " до " + MAX_DEFENSE_POINTS + "!");
    }
}
