package core.exceptions;

import static core.Constants.Game.MAX_DEFENSE_POINTS;
import static core.Constants.Game.MIN_DEFENSE_POINTS;

public class IncorrectDefenseException extends IllegalArgumentException {
    public IncorrectDefenseException() {
        super("Значение защиты должно лежать от " + MIN_DEFENSE_POINTS + " до " + MAX_DEFENSE_POINTS + "!");
    }
}
