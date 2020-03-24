package academy.learn.programming.questions;

/**
 * Created by catenate on 22/03/2020.
 */


class Arthropod{
    public void printName(double input){
        System.out.println("Arthropod");
    }
}
public class Spider extends Arthropod {
    public void printName(int input){  //this is an overload
        System.out.println("Spider");
    }

    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.printName(5);
        spider.printName(8.6);
    }
}
