package JavaOOP3;

public class Main {
    public static void main(String[] args) {

        Cat[] catArr = { new Cat("Barsik"),
                         new Cat("Tuzik"),
                         new Cat("Murzik"),
                         new Cat("Kazluha"),
                         new Cat("LOH"),
                         new Cat("Baran")};


        Plate plate = new Plate(80);

        plate.info();

        for (Cat cat : catArr) {
            cat.info();
            cat.eat(plate);
            cat.catSatietyState();
        }

        plate.addFood(100);

        System.out.println("""



                """);

        for (Cat cat : catArr) {
            cat.info();
            cat.eat(plate);
            cat.catSatietyState();
        }



    }
}
