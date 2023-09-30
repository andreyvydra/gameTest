package core.exceptions;

import static core.Constants.Game.MIN_HEALTH_POINTS;

/**
 * Этот класс ошибки служит для того, чтобы оповещать
 * о некорректном значении здоровья, которое должен быть больше, чем
 * MIN_HEALTH_POINTS
 *
 * @see entities.Entity
 * @see core.Constants.Game
 */
public class IncorrectHealthException extends IllegalArgumentException {
    public IncorrectHealthException() {
        super("Изначальное значение здоровья должно быть от " + MIN_HEALTH_POINTS + "!");
    }
}
