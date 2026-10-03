package SimsGame;

public class Child extends Sims {
    private String favoriteToy;

    public Child (String n, int a, String ft) {
        super(n,a);
        favoriteToy = ft;
    }
    public void cry() {
        System.out.println("they're crying");
    }
    @Override
    public void doSomething() {
        energy -= 15;
        System.out.println("They're playing with " + favoriteToy);
    }

}
