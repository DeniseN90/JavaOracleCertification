package academy.learn.programming;

public class Bear extends Animal implements Omnivor {
    
    @Override
    public void eatMeat() {
        System.out.println("Eat meat");
    }

    @Override
    public void eatPlants() {
        System.out.println("Eat plants");

    }
}