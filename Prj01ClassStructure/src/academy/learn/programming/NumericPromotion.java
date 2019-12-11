package academy.learn.programming;

public class NumericPromotion {
    public static void main(String[] args) {

        // promotion (upcasting)
        int x = 5;
        double y = 10.66;

        System.out.println("Result " + x + y);
        System.out.println("Result " + (x + y));

        byte b = 10;
        int a = 5;
        double c = 4.5;

        double result = a + b + c;

        System.out.println("Result is double: " + result);

       //casting (downcasting)

       double d = 5.55;
       int e = 4 + (int) d; // need an explicit casting to compile
       System.out.println("E = " + e);

       int f = 125;
       byte g = 15;

       int r = f + g;
       System.out.println("R = " + r);
        // dowwncasting
       byte r2 = (byte) (f + g); // overflow happens here and from 127 goes to -116     System.out.println("R = " + r2);

    }
}
