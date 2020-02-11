package academy.learn.programming;

public interface Carnivor {
    default void eatMeat() {
        System.out.println("Eat meat");

    }
}