package academy.learn.programming;

import java.util.Objects;

public class Polymorphism {





    public static void main(String[] args) {

        Dog dog = new Husky(9);

        Husky husky = new Husky(7);
        husky.setAge(8);
        husky.setName("Rex");

        dog = husky;

        dog.printDetails();

        dog.getTailLength();

        HasTail hasTail = husky;

        hasTail.getTailLength();

        Dog dog2 = husky;

        CanRun canRun = new Dog(5) {
            @Override
            public int run(int i) {
                return i;
            }

            @Override
            public int getTailLength() {
                return 7;
            }
        };


        Dog rex = ( Dog ) canRun;


        Object object = husky;
        ((Husky) object).getTailLength(); // downcasting




    }
}