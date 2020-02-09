package academy.learn.programming;

public class Snake extends Reptile{

    @Override
    protected boolean hasLegs() {
        return false;
    }

    @Override
    public double getWeigth() {
        return 10.7;
    }
}