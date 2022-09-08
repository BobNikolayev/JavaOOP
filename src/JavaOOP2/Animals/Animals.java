package JavaOOP2.Animals;

public  class Animals {

    protected String name;
    protected int maxRunRange;
    protected int maxSwimRange;

    private static int animalCounter;


    public Animals(String name, int runRange, int swimRange) {
        this.name = name;
        this.maxRunRange = runRange;
        this.maxSwimRange = swimRange;
        animalCounter++;
    }

    public static int getAnimalCounter() {
        return animalCounter;
    }

    public String getName() {
        return name;
    }

    public int getMaxRunRange() {
        return maxRunRange;
    }

    public int getMaxSwimRange() {
        return maxSwimRange;
    }

    public void swim(int swimRange){
        if (getMaxSwimRange() >= swimRange){
            System.out.println(getName() + " swim " + swimRange + "m");
        }if (getMaxSwimRange() == 0){
            System.out.println(getName() + " can not swim...");
            return;
        }if (getMaxSwimRange() < swimRange){
            System.out.println(getName() + " can not swim so far...");
        }
    }

    public void run(int runRange){
        if (getMaxRunRange() >= runRange){
            System.out.println(getName() + " run " + runRange + "m");
        }else{
            System.out.println(getName() + " can not run so far...");
        }
    }

}
