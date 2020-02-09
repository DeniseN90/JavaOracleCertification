package academy.learn.programming;

public class Animal {

    private int age;
    private String name;

    public Animal() {

    }

    public Animal (int age) {
        System.out.println("Animal constructor");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void printDetails () {
        System.out.println("Animal");
        System.out.println("name = " + name +" age = "+ age);
    }

    public void eat (){
        System.out.println("Animal eats");
    }

    public double getAverageHeight (){
        return 98.6;
    }


}