package MarioKart;

import java.util.ArrayList;

public class MarioKartPolymorphism {
    public static void main(String[] args) {

        ArrayList<Character> characters = new ArrayList<>();

        characters.add(new Luigi("Luigi", "Curly"));
        characters.add(new Toad("Toad", 20));
        characters.add(new PrincessPeach("Princess Peach", "Pink!"));


        Character lui = new Luigi("Luigi", "Curly");
        Character toe = new Toad("Toad", 20);
        Character pr = new PrincessPeach("Princess Peach", "Pink!");



        System.out.println("LAST LAP! Use your special item!");
        for(Character character : characters)
            character.throwAnItem();

    }
}
