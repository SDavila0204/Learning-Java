package SimsGame;

enum Mood {HAPPY, SAD, DEPRESSED, DEFAULT}
public class Sims {
    protected String name;
    protected int age;
    protected int hunger;
    protected int energy;
    protected Mood mood;


    //constructor
    public Sims(String n, int a) {
        name = n;
        age = a;
        hunger = 50;
        energy = 100;
        mood = Mood.DEFAULT;
    }

    public void sleep() {
        energy += 20;
        System.out.println("They're sleeping");
    }

    public void eat() {
        hunger -= 20;
        System.out.println("They're eating");
    }

    public void setMood(Mood m) {
        mood = m;
    }

    public void doSomething() {
        energy -= 10;
        System.out.println("They're doing something :p");
    }

}
