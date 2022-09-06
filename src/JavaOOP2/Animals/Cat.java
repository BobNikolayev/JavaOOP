package JavaOOP2.Animals;

import java.util.Random;

public class Cat extends Animals{

    public Cat(String name, int runRange, int swimRange) {
        super(name, runRange, swimRange);
    }

    @Override
    public void swim() {
        System.out.println("Cat can not swim.");
    }

    @Override
    public void run() {
        setRunRange((int) (Math.random() * 200));
        System.out.println(getName() + " running " + getRunRange() + "m");
    }


}
