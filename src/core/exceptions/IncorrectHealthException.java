package core.exceptions;

import static core.Constants.Entity.MIN_HEALTH_POINTS;

public class IncorrectHealthException extends IllegalArgumentException {
    public IncorrectHealthException() {
        super("Изначальное значение здоровья должно быть от " + MIN_HEALTH_POINTS + "!");
    }
}
