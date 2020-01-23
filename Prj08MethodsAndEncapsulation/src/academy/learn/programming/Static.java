package academy.learn.programming;

/**
 * Created by catenate on 23/01/2020.
 */
public class Static {
    private String name = "Static";

    public static void one (){}
    public static void two(){}

    public static void three (){
        one();
        two();
//        four(); // DOESN'T COMPILE
    }

    public void four(){
        one();
        two();
        three();
        System.out.println(name);
    }

    public static void main(String[] args) {
        one();
        two();three();
//        four();  // DOESN'T COMPILE

        Static myInstance = new Static();
        myInstance.four();
    }
}
