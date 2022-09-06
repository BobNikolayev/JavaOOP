package JavaOOP2;

import JavaOOP2.Animals.Animals;
import JavaOOP2.Animals.Cat;
import JavaOOP2.Animals.Dog;

public class Main {
    private Object Animals;
    public static void main(String[] args) {

//        Animals cat = new Cat("bars",200,10);
//        Animals dog = new Dog("tuz",500,10);
//
//        dog.run();
//        dog.swim();
//        cat.run();
//        cat.swim();
        Animals animalsArr[] = new Animals[5];

        animalsArr[0] = new Dog("Tuzik", 500,100);
        animalsArr[1] = new Dog("Nika",500,11);
        animalsArr[2] = new Cat("Bars",500,11);
        animalsArr[3] = new Cat("Murzik",500,11);
        animalsArr[4] = new Cat("Kuzia",500,11);

    animalsCount(animalsArr);

    }

    public static void animalsCount(Animals[] animals){
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Cat){
                catCount ++;
            }
            if(animals[i] instanceof Dog){
                dogCount++;
            }
        }
        System.out.println("We have " + catCount + " cats and " + dogCount + " dogs.");
    }

//    public int runRangeGenerate() {
//        if (Animals instanceof Cat) {
//            return (int) (Math.random() * 200);
//        } else
//            return (int) (Math.random() * 500);
//    }
//
//
//    public int swimRangeGenerator() {
//        return (int) (Math.random() * 10);
//    }

}