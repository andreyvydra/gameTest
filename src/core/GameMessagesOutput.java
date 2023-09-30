package core;

import entities.Entity;

/**
 * Статический класс для работы со стандартным выводом игры
 *
 * @see Entity
 */
public class GameMessagesOutput {
    public static void printAttackMessage(Entity from, Entity to, int dice) {
        String attackerName = from.getName();
        String defenderName = to.getName();
        printLine(attackerName + " успешно атакует " + defenderName + ", выбрасывая " + dice);
    }

    public static void printMissMessage(Entity from, Entity to, int dice) {
        String attackerName = from.getName();
        String defenderName = to.getName();
        printLine(attackerName + " не попал по " + defenderName + ", выбрасывая " + dice);
    }

    public static void printDefenseMessage(Entity from, Entity to, int damage) {
        String defenderName = from.getName();
        String attackerName = to.getName();
        printLine(attackerName + " наносит " + damage + " урона " + defenderName);
    }

    public static void printRebornMessage(Entity entity, int hp) {
        String entityName = entity.getName();
        printLine(entityName + " воскрешает с " + hp + " hp");
    }

    public static void printDeathMessage(Entity entity) {
        printLine(entity.getName() + " погиб");
    }

    public static void print(String symbols) {
        System.out.print(symbols);
    }

    public static void printLine(String line) {
        System.out.println(line);
    }
}
