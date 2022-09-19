package JavaOOP3;

public class Plate {
    int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void eatFood(Cat cat){
        if (food >= cat.getSatietyCounter()){
            food -= cat.getSatietyCounter();
            System.out.println(cat.getName() + " eat from the plate " + getFood() + " food remained.");
            cat.setSatietyIndicator(true);
        }else {
            System.out.println("Not enough food in the plate.");
        }
    }

    public void addFood(int add){
        if(add < 0){
            return;
        }
        setFood(getFood() + add);
        System.out.println("Food added " + getFood() + " ,food remaining.");
    }
    public void info(){
        System.out.println(getFood() + " food in the plate.");
    }

}
