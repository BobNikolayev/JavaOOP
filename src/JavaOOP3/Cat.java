package JavaOOP3;

public class Cat {
    private final String name;
    private final int satietyCounter;
    private boolean satietyIndicator = false;

    public Cat(String name) {
        this.name = name;
        satietyCounter = (int) (8 + Math.random() * 12);
    }

    public String getName() {
        return name;
    }

    public void setSatietyIndicator(boolean satietyIndicator) {
        this.satietyIndicator = satietyIndicator;
    }

//    public boolean isSatietyIndicator() {
//        return satietyIndicator;
//    }

    public void catSatietyState(){
        if (!satietyIndicator){
            System.out.println("Cat " + name + " is hungry.");
        }else{
            System.out.println("Cat " + name + " is satisfied." );
        }
    }
    public int getSatietyCounter() {
        return satietyCounter;
    }

    public void info(){
        System.out.println(name + " " + satietyCounter);
    }

    public void eat(Plate plate){
        plate.eatFood(this);

    }

}
