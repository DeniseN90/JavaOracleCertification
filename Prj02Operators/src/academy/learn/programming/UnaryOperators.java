package academy.learn.programming;

public class UnaryOperators {
    public static void main(String[] args) {

        int x = + 3 ; // redundant

        int y = - x ;

        System.out.println("X = "+ x + " , Y = " + y);

        y = - y ;

        System.out.println("Y = " + y);

        boolean a = true;

        boolean b = !a;

        System.out.println("A = "+ a + ", B = " + b);

        // increment and decrement unary operators
        int c = 5;
        int d = ++c;

        int e = 5;
        int f = e++;

        System.out.println("C = " + c + " , D = " + d);

        System.out.println("E = "+ e+ " F = "+ f);


    int g = 6;
    int h = 2;
    int i = ++h + --g *3 + 2 * g++ + h-- % --g;

    System.out.println("G = "+ g + ", H = " + h + ", I = " + i);




    }
}
