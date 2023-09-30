import core.GameMessagesOutput;
import entities.Monster;
import entities.Player;
import entities.Team;

import java.util.concurrent.TimeUnit;

import static core.Constants.Color.ANSI_GREEN;
import static core.Constants.Color.ANSI_YELLOW;
import static core.Constants.System.SECONDS_TO_SLEEP;

/**
 * Класс, который симулирует бой между командами, логику игры
 *
 * @see core.Constants.Entity
 * @see core.Constants.Color
 */
public class Game {
    public void gameLoop() throws InterruptedException {
        Team team1 = new Team(ANSI_YELLOW);
        for (int i = 0; i < 1; i++) {
            team1.addTeammate(new Player("Игрок " + i));
        }

        Team team2 = new Team(ANSI_GREEN);
        for (int i = 0; i < 3; i++) {
            team2.addTeammate(new Monster("Монстр " + i));
        }
        while (!team1.isEmpty() && !team2.isEmpty()){
            team1.attack(team2);
            team2.attack(team1);
            GameMessagesOutput.printLine("--------------------------------------------");
            TimeUnit.SECONDS.sleep(SECONDS_TO_SLEEP);
        }
    }
}
