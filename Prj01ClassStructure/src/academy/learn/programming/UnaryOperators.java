package academy.learn.programming;

public class UnaryOperators {

    public static void main(String[] args) {
        int x = + 3; // redundant
        System.out.println("X = " + x);

        double y = - x;
        System.out.println("Y = " + y + " and X = " + x);

        y = - y ;

        System.out.println("Now Y = " + y );

        boolean a = true ;
        boolean b = !a;
        System.out.println("A = " + a + " B = " + b);
        b = !b ;
        System.out.println("Now B = " + b);


        // int f = !5; WTF
        // boolean g = - true;
        // boolean z = !0;

        int h = 5;
        int j = ++h;

        System.out.println("H = "+h + " J = " + j);

        int k = 5;
        int i = k ++;
        System.out.println("K = "+ k + " I = " + i);

        int count = 0;
        System.out.println(count);
        System.out.println(++count);
        System.out.println(count);
        System.out.println(count--);
        System.out.println(count);

        int l = 3;
        int m = ++l * 5 / l-- + --l;

        System.out.println("M = " + m);

        int o = 6;
        int n = 2;
        int v = ++n + --o * 3 + 2 * o++ - n-- % --o;
        // 3 +bb
        System.out.println("V = " + v);
    }

}
