package SubZero;

public class Character {
    private double health;

    public Character(double health) {
        this.health = health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }


    public double attack(double power) {
        return power;
    }

    @Override
    public String toString() {
        return ("character health: " + health);
    }

}
