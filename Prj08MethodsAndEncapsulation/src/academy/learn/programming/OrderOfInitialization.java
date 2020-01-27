package academy.learn.programming;


class Example {
    private String name = "dog";
    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static { System.out.println(COUNT); }

    static { COUNT += 10; System.out.println(COUNT); }

    public Example(){
        System.out.println("constructor");

    }


}
public class OrderOfInitialization {
    public static void main(String[] args) {
        Example example = new Example();
    }
}