package SubZero;

public class ClassicSubZero extends SubZero {
    protected double powerBar;

    public ClassicSubZero(double health, int temperature, double powerBar) {
        super(health, temperature);
        this.powerBar = powerBar;
    }
    public double attack(double power) {
        System.out.println("Classic subzero uses frozen fist!");
        powerBar += power/2;
        return 1.2*(-power);
    }
    @Override
    public String toString(){
        return ("classic sub zero: health: " + getHealth() +
                ", temp: " + temperature + ", powerBar: " + powerBar);
    }
}
