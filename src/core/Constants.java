package core;


/**
 * Класс с классами/enum глобальных констант для стандартизации
 * использования классов и возможности простой настройки стандартных значений
 *
 * @see Entity
 * @see Player
 * @see Game
 * @see Monster
 */
public class Constants {

    public static class Entity {

        // Default parameters for all entities
        public static int DEFAULT_HEALTH_POINTS = 100;
        public static int DEFAULT_MIN_DAMAGE_POINTS = 100;
        public static int DEFAULT_MAX_DAMAGE_POINTS = 200;
        public static byte DEFAULT_ATTACK_POINTS = 15;
        public static byte DEFAULT_DEFENSE_POINTS = 15;
        public static int MIN_ATTACK_MODIFIER = 1;
        public static int THRESHOLD = 5;
        public static byte DEFAULT_LIVES_COUNT = 1;

    }

    public static class Game {
        // Main globals for game logic
        public static int MIN_DAMAGE_POINTS = 1;
        public static int MIN_HEALTH_POINTS = 1;
        public static byte MAX_DEFENSE_POINTS = 30;
        public static byte MIN_DEFENSE_POINTS = 1;
        public static byte MAX_ATTACK_POINTS = 30;
        public static byte MIN_ATTACK_POINTS = 1;
        public static int MAX_DICE_VALUE = 6;
        public static byte MIN_LIVES_COUNT = 1;

    }

    public static class System {
        public static byte SECONDS_TO_SLEEP = 3;
    }


    public enum Color {
        ANSI_RESET("\u001B[0m"),
        ANSI_BLACK("\u001B[30m"),
        ANSI_RED("\u001B[31m"),
        ANSI_GREEN("\u001B[32m"),
        ANSI_YELLOW("\u001B[33m"),
        ANSI_BLUE("\u001B[34m"),
        ANSI_PURPLE("\u001B[35m"),
        ANSI_CYAN("\u001B[36m"),
        ANSI_WHITE("\u001B[37m");

        private final String color;

        Color(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return color;
        }
    }

    public static class Player extends Entity {
        public static byte DEFAULT_LIVES_COUNT = 4;
        public static int DEFAULT_HEALTH_POINTS = 200;
        public static byte DEFAULT_ATTACK_POINTS = 6;
        public static byte DEFAULT_DEFENSE_POINTS = 6;
        public static int DEFAULT_MIN_DAMAGE_POINTS = 100;
        public static int DEFAULT_MAX_DAMAGE_POINTS = 200;
    }

    public static class Monster extends Entity {
        public static int DEFAULT_HEALTH_POINTS = 150;
        public static byte DEFAULT_ATTACK_POINTS = 5;
        public static byte DEFAULT_DEFENSE_POINTS = 5;
        public static int DEFAULT_MIN_DAMAGE_POINTS = 50;
        public static int DEFAULT_MAX_DAMAGE_POINTS = 100;
    }

}
