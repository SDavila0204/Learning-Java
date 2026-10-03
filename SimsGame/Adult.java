package SimsGame;

public class Adult extends Sims {
    private String work;

    public Adult(String n, int a, String w) {
        super (n,a);
        work = w;
    }

    public void cook() {
        System.out.println("They're cooking");
    }

    public void payBills() {
        System.out.println("They're paying the bills");
    }
    @Override
    public void doSomething() {
        energy -= 25;
        System.out.println("They're working");
    }

}
