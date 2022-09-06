package JavaOOP2.Animals;

import java.sql.SQLOutput;

public abstract class Animals {

    protected String name;
    protected int runRange;
    protected int swimRange;

    public Animals(String name, int runRange, int swimRange) {
        this.name = name;
        this.runRange = runRange;
        this.swimRange = swimRange;
    }

    public String getName() {
        return name;
    }

    public int getRunRange() {
        return runRange;
    }

    public int getSwimRange() {
        return swimRange;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRunRange(int runRange) {
        this.runRange = runRange;
    }



    public void setSwimRange(int swimRange) {
        this.swimRange = swimRange;
    }

    public abstract void swim();

    public abstract void run();

//    public void swimming(){
//        System.out.println(getName() + "Swimming " + getSwimRange() + "m");
//    }
//
//    public void running(){
//        System.out.println(getName() + "running " + getRunRange() + "m");
//    }


}
