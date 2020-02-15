package academy.learn.programming.questions;

class Computer {
    protected final int process() { return 5; }
}
public class Laptop extends Computer {
//    public final int process() { return 3; } can't override final method, but it could hide it if it was private
    public static void main(String[] chips) {
        System.out.print(new Laptop().process());

    }
}