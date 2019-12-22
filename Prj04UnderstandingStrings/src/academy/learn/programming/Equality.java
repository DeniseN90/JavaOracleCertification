package academy.learn.programming;

public class Equality {
    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("Java");

        System.out.println(one == two);
        System.out.println(one == three);

        String x = "Java";
        String y  = "Java";

        System.out.println(x == y);

        String a = "Java";
        String b = "Java".trim();
        System.out.println("a == b = " + (a == b)); // return false cause the trim method returns a new object


        String c = "Java";
        String d  = "Ja".trim() + "va";
        System.out.println(("c == d = ") + (c == d)); // return false cause the trim method returns a new object


    }
}
