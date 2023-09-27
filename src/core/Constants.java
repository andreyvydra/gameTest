package core;

public class Constants {
    public static class Entity {

        // Default values
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

    public static class Player {
        public static byte DEFAULT_LIVES_COUNT = 4;
        public static int DEFAULT_HEALTH_POINTS = 200;
        public static byte DEFAULT_ATTACK_POINTS = 20;
        public static byte DEFAULT_DEFENSE_POINTS = 20;
        public static int DEFAULT_MIN_DAMAGE_POINTS = 200;
        public static int DEFAULT_MAX_DAMAGE_POINTS = 300;
    }

}
