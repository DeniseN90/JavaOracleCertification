package academy.learn.programming;

public class Dog extends Animal {


    public Dog(int age){
        super(age);
//        this.age; DOESN'T COMPILE
        System.out.println("Dog Constructor");
    }

    @Override
    public void eat(){
//        super.eat();
        System.out.println("Dog eats");
        super.eat();
    }

    @Override
    public double getAverageHeight() {
        return super.getAverageHeight() +10;
    }
}