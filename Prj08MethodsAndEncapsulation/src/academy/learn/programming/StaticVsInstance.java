package academy.learn.programming;

/**
 * Created by catenate on 23/01/2020.
 */
public class StaticVsInstance {

    private String name = "Static class";
    public static void first() { }
    public static void second() { }
    public void third() { System.out.println(name); }
    public static void main(String args[]) {
        first();
        second();
//        third(); // DOES NOT COMPILE
    }
}
