package entities;

/**
 * Простой интерфейс, который обязывает реализовать
 * метод attack
 *
 * @see Entity
 */
public interface Attacking {
    void attack(Entity somebody);
}
