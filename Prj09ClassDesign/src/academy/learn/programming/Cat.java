package academy.learn.programming;

public class Cat extends Animal {

    public Cat(int age){
        super(age);
        System.out.println("Cat constructor");
    }


    @Override
    protected void printDetails() {
        System.out.println(getAge());
        System.out.println("Cat details");
    }
}