package academy.learn.programming;


class Lion{

    private String name;
    private String sex;
    private double weigth;

    public Lion(){
        this("Leo");
    }

    public Lion(String name){
        this(name, "female");
        weigth = 230.0;
        System.out.println("constructor 1");
    }

    public Lion(String name, String sex){
        this(name, sex, 230.0);
        System.out.println("constructor 2");
    }

    public Lion(String name, String sex, double weigth){
        this.name =  name;
        this.sex = sex;
        this.weigth = weigth;
        System.out.println("constructor 3");
    }

    public void print (){
        System.out.print(name + " ");
        System.out.print(sex + " ");
        System.out.print(weigth);
        System.out.println();
    }


}
public class OverloadingConstructors {

    public static void main(String[] args) {

        Lion lionOne = new Lion("Carol");
        lionOne.print();
        Lion lionTwo = new Lion("Lola", "female");
        lionTwo.print();
        Lion lionThree = new Lion("Leo", "male", 350);
        lionThree.print();
    }
}