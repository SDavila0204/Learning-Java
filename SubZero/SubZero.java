package SubZero;

public class SubZero extends Character {
    protected int temperature;

    public SubZero(double health, int temperature) {
        super(health);
        this.temperature = temperature;
    }

    @Override
    public double attack(double power){
        return 1.2 * (-power);
    }

    public void gotHit(double damage) {
        setHealth(getHealth() -damage);
    }
    @Override
    public String toString(){
        return "subzero health: " + getHealth() + ", temp: " + temperature;
    }
}
