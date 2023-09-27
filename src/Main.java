import entities.Monster;
import entities.Player;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Player player = new Player();
        Monster monster = new Monster();
        while (player.isAlive() && monster.isAlive()){
            player.attack(monster);
            monster.attack(player);
            System.out.println(player);
            System.out.println(monster);
        }
    }
}
