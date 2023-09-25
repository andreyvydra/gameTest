package core.exceptions;

public class RangeAttackException extends IllegalArgumentException {
    public RangeAttackException() {
        super("Указан неправильный диапазон атаки. " +
                "Максимальная величина атаки должна быть больше или равна минимальной!");
    }
}
