package entities;

import core.Constants;
import core.GameMessagesOutput;

import java.util.*;

import static core.Constants.Color.ANSI_RESET;
import static java.lang.Math.floor;
import static java.lang.Math.random;


/**
 * Команда определяет цвет и определяет взаимодействие между
 * разными командами
 *
 * @see core.Constants.Color
 * @see Entity
 */
public class Team {
    private final LinkedList<Entity> teammates = new LinkedList<>();
    private final Constants.Color color;

    public Team(List<? extends Entity> entities, Constants.Color color) {
        teammates.addAll(entities);
        this.color = color;
    }

    public Team(Constants.Color color) {
        this.color = color;
    }

    public void addTeammate(Entity entity) {
        teammates.add(entity);
    }

    public void attack(Team others) {
        GameMessagesOutput.print(color.toString());
        for (Entity teammate : teammates) {
            Entity other = others.getRandomTeammate();
            if (!Objects.isNull(other)) {
                teammate.attack(other);
                others.clear();
            }
        }
        GameMessagesOutput.print(String.valueOf(ANSI_RESET));
    }

    public void clear() {
        teammates.removeIf(entity -> !entity.isAlive());
    }

    public boolean isEmpty() {
        return teammates.size() == 0;
    }

    public Entity getRandomTeammate() {
        int idx = (int) floor(random() * teammates.size());
        int i = 0;
        for (Entity teammate : teammates) {
            if (i == idx) {
                return teammate;
            }
            i++;
        }
        return null;
    }
}
