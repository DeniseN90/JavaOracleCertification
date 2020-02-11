package academy.learn.programming;

public class Rabbit extends Animal implements Hop, Herbivor {

    public Rabbit(){
        super();
        super.setAge(6);
        // this.setAge(4); SAME
//        setAge(7); SAME
    }

    public Rabbit(int age) {
//        this(age); RECURSIVE
        super();
//        this();  // DOESN'T COMPILE
    }

    @Override
    protected void printDetails() {
        System.out.println("Rabbit jumps: " + Hop.getAverageJumpHeigth());

    }
}