package academy.learn.programming.abs.classes;

public class Bird extends Animal {

    public void fly(){
        System.out.println("Bird flies");
    }


    public void eat(int amount ){
        System.out.println("bird is eating");
    }


    @Override
    public void run() {
        System.out.println("Bird run");
    }
}