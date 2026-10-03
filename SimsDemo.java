package SimsGame;

public class SimsDemo {

    public static void main(String[] args) {
        Adult a1 = new Adult("Emilio Avila", 23,"professor");
        Child c1 = new Child("Alicia Moon", 11, "monster high");

        a1.cook();
        a1.sleep();
        a1.payBills();
        a1.doSomething();
        a1.setMood(Mood.DEPRESSED);

        c1.sleep();
        c1.doSomething();
        c1.setMood(Mood.HAPPY);


    }
}
