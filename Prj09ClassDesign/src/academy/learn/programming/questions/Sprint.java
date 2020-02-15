package academy.learn.programming.questions;

interface Run {

    default void walk() {
        System.out.print("Walking and running!");
    }
}
interface Jog {
    default void walk() {
        System.out.print("Walking and jogging!");
    }
}
public class Sprint implements Run, Jog {

    public void walk() {
        System.out.print("Sprinting!");
    }


    public static void main(String[] args) {
        new Sprint().walk();
    }
}
