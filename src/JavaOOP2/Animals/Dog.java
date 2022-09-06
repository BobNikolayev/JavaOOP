package JavaOOP2.Animals;

public class Dog extends Animals {

    public Dog(String name, int runRange, int swimRange) {
        super(name, runRange, swimRange);
    }

    @Override
    public void swim() {
        setSwimRange((int) (Math.random() * 500));
        System.out.println(getName() + " swimming " + getSwimRange() + "m");
    }

    @Override
    public void run() {
        setRunRange((int) (Math.random() * 10));
        System.out.println(getName() +  " running " + getRunRange() + "m");
    }

}

