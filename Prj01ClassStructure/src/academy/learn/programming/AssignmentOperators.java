package academy.learn.programming;

public class AssignmentOperators {

    public static void main(String[] args) {
        //    int x = 1.0; doesn't compile
//    short y = 67633;
//    int z = 9f;
//    long d = 7868768768767;

        int x = (int) 1.0;
        short y = (short) 67633756; // will cause an overflow (Java automatically wraps the value)
        int z = (int) 9f;
        long d = 7868768768767L;

        System.out.println("x = " + x + " y = " + y + " z = " + z + " d = "+ d);

        byte b  = 127;
        byte l = -128;
        System.out.println("B = " + b + " L = " + l);

//        b = b + 1; doesn't compile cause byte is automatically converted to int
        ++b;
        System.out.println("B = " + b);

        l--;

        System.out.println("L = " + l);

        short a = 10;
        short f = 20;
//        short c = a*f; doesn't compile cause short is promoted to int

        short c = (short) (a*f);
        System.out.println("C = " + c);


    }



}
