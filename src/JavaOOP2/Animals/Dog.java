package JavaOOP2.Animals;

public class Dog extends Animals {

    private static int animalCounter;

    public Dog(String name) {
        super(name,  500,10);
        animalCounter++;
    }

    public static int getDogCounter() {
        return animalCounter;
    }
}

