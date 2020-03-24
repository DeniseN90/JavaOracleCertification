package academy.learn.programming.questions;

/**
 * Created by catenate on 22/03/2020.
 */

class Canine{
    public double getAverageWeight(){
        return 50;
    }
}
public class Wolf extends Canine {
    public double getAverageWeight(){
        return super.getAverageWeight() + 20;
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());

        Canine canine = new Wolf(); // 70
        System.out.println(canine.getAverageWeight());

        Wolf wolf =  new Wolf(); // 70
        System.out.println(wolf.getAverageWeight());
    }
}
