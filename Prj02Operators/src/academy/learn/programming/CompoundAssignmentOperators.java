package academy.learn.programming;

public class CompoundAssignmentOperators {

    public static void main(String[] args) {
        int x = 2;
        int z = 3;
        x = x * z;

        x *= z; // shorter form

        System.out.println("X = " + x);

//        int a += 5; doesn't compile


        long a = 10;
        int b = 4;
//        b = b * a; doesn't compile
        //b = (int) (a*b);
        b  *= a; // short for b = (int) (a*b);

        System.out.println("B = " + b);

        long c = 4;
        long d = (c = 2);

        System.out.println("C = " + c +" D = "+d);

        long e = 3 ;
        long f = 2; // redundant initialization
        long h = 1;
        long i = e + 3 * (f=3) - (h -= 2);
        System.out.println("I = " + i);

    }
}
