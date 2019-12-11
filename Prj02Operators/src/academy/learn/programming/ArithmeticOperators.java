package academy.learn.programming;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int result = 3 - 2 + 2 * 2 + 3;
        System.out.println(result);

        result = 4 / 2 + 1 - 4 * 2 + 10;
        System.out.println(result);

        int a = 4;
        int b = 3 - 2 * --a;
        System.out.println("A = "+ a + ", B = "+ b);

        a = 4;
        b = 3 - 2 * a--;
        System.out.println("A = "+ a + ", B = "+ b);

        result = 10 - 3 * ( 2 + 1 ) - 4 / (1 + 3);
        System.out.println(result);

        int i = 10;
        int j = 3;
        int k = i % j;
        int m = j% i;
        System.out.println("K = "+ k + ", M = " + m);

        int A = 4;
        System.out.println("A = "+ A);
        int B = 3 - 2 * --A;

        System.out.println("B = " + B);
        System.out.println("A = " + A);

        long c = 2;
        System.out.println("C = " + c);
        long d = 4 + 3 * c++; // it's like writing c = c + 1

        System.out.println("D = " + d);
        System.out.println("C = " + c);

        int e = 10 - 3 * ( 2 + 1 ) -4 / (1 + 3 );
        System.out.println("E = " + e );

        int z = 10;
        int y = 3;
        int p = z % y;

        int f = 10 % 2;

        System.out.println("I = " + z );
        System.out.println("Y = " + y );
        System.out.println("P = " + p );
        System.out.println("F = " + f );

        int g = 12;
        int h = 5;
        int q = 2;

        int v = g / 2 - 10 % (4 + 3) - 2 * g % h - q * 3;

        System.out.println("V = " + v);
    }
}
