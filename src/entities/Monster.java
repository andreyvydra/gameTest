package entities;

public class Monster extends Entity {

    @Override
    public String toString() {
        return "Монстр {" +
                "урон=" + minDamagePoints + '-' + maxDamagePoints +
                ", атака=" + attackPoints +
                ", защита=" + defensePoints +
                ", здоровье=" + healthPoints +
                "}";
    }
}
