package academy.learn.programming;

public class Rabbit extends Animal {

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
}