package SubZero;

public class SubZeroDemo {
    public static void main(String[] args) {
        ClassicSubZero a = new ClassicSubZero(100, 50, 0);
        CyberSubZero b = new CyberSubZero(100, 55, 1);

        System.out.println("Classic attacks with 30 power");
        a.attack(30);

        System.out.println("Cyber attacks with 40 power");
        b.attack(40);

        System.out.println(a);
        System.out.println(b);
    }
}
