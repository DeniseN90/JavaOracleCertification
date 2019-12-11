package academy.learn.programming;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int a = 4;
        System.out.println("A = "+ a);
        int b = 3 - 2 * --a;

        System.out.println("B = " + b);
        System.out.println("A = " + a);

        long c = 2;
        System.out.println("C = " + c);
        long d = 4 + 3 * c++; // it's like writing c = c + 1

        System.out.println("D = " + d);
        System.out.println("C = " + c);

        int e = 10 - 3 * ( 2 + 1 ) -4 / (1 + 3 );
        System.out.println("E = " + e );

        int i = 10;
        int y = 3;
        int k = i % y;

        int f = 10 % 2;

        System.out.println("I = " + i );
        System.out.println("Y = " + y );
        System.out.println("K = " + k );
        System.out.println("F = " + f );

        int g = 12;
        int h = 5;
        int j = 2;

        int m = g / 2 - 10 % (4 + 3) - 2 * g % h - j * 3;

        System.out.println("M = " + m);


    }
}
