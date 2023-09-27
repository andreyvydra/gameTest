package core.exceptions;

public class RangeDamageException extends IllegalArgumentException {
    public RangeDamageException() {
        super("Указан неправильный диапазон атаки. " +
                "Максимальная величина атаки должна быть больше или равна минимальной!");
    }
}
