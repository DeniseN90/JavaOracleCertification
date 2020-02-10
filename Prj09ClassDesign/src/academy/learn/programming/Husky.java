package academy.learn.programming;

public class Husky extends Dog {


    public Husky (int age){
        super(age);
        System.out.println("Husky constructor");
    }

    @Override
    public int getTailLength() {
        return 6;
    }


    @Override
    public int run(int speed) {
        return speed;
    }
}