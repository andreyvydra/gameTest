package core.exceptions;

/**
 * Этот класс ошибки служит для того, чтобы оповещать
 * о некорректном значении урона, где минимальное значение
 * должно быть больше, чем максимальное
 *
 * @see entities.Entity
 * @see core.Constants.Game
 */
public class RangeDamageException extends IllegalArgumentException {
    public RangeDamageException() {
        super("Указан неправильный диапазон атаки. " +
                "Максимальная величина атаки должна быть больше или равна минимальной!");
    }
}
