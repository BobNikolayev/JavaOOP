package JavaOOP2.Animals;

public class Cat extends Animals{

    private static int animalCounter;


    public Cat(String name) {
        super(name,(int) (100 + Math.random() * 100) , 0);
        animalCounter++;
    }

    public static int getCatCounter() {
        return animalCounter;
    }

}
