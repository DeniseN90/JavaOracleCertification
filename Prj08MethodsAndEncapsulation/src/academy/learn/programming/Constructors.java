package academy.learn.programming;


class Dog {

    private String color;

    public Dog(String color){
        System.out.println("Constructor");
        this.color = color;
    }

    public void printColor(){
        System.out.println(color);
    }

    public void Dog(){} // is not a constructor
}


class Cat {
    private String color;
    private int height;
    private int length;

    public Cat(int length, int height){
        this.length = length;
        this.height = height;
        color = "black";

    }

    public void printInfo(){
        System.out.println(this.length + " " + this.height+ " " + color);
    }
}




public class Constructors {


    public static void main(String[] args) {
        Dog dog = new Dog("red");
        dog.printColor();

        Cat cat = new Cat(8, 9);
        cat.printInfo();
    }
}