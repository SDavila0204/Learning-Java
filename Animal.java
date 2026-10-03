package Animal;

class Animal {
    public void feed() {
        System.out.println("Feeding animal: one portion of food");
    }
}

class Dog extends Animal {
    @Override
    public void feed() {
        System.out.println("Feeding dog: two cups of food and water");
    }
}

class Cat extends Animal {
    @Override
    public void feed() {
        System.out.println("Feeding cat: one cup of cat food and water");
    }
}

public class AnimalShelter {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Dog(), new Cat()};

        for( Animal a : animals)
            a.feed();

        animals[0].feed(); //lets you feed dog one more time

    }
}
