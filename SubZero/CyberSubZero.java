package SubZero;

public class CyberSubZero extends SubZero{
    protected double powerBar;

    public CyberSubZero(double health, int temperature, double powerBar) {
        super(health, temperature);
        this.powerBar = powerBar;
    }

    public double attack(double power) {
        System.out.println("Cybersubzero fires freeze cannon!");
        powerBar += power/2;
        return 1.2*(-power);
    }
    @Override
    public String toString() {
        return ("CyberSubZero: health: " + getHealth() +
                " temp: " + temperature + ", powerBar: " + powerBar);
    }

    private String getTemperature() {
        return null;
    }
}
