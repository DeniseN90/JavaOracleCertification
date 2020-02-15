package academy.learn.programming;

public class Main {
    public static void main(String[] args) {
        Husky husky = new Husky(5);
//        Dog dog = new Dog(8);
        Animal animal = new Animal(2);

        Animal an = new Husky(7);


        System.out.println("========");

        Cat cat = new Cat(9);

        husky.printDetails();

//        dog.setName("Rex");
//        dog.printDetails();

        husky.eat();

        husky.getAverageHeight();
        System.out.println(husky.getAverageHeight());

        Rabbit rabbit = new Rabbit();
        rabbit.printDetails();
    }
}