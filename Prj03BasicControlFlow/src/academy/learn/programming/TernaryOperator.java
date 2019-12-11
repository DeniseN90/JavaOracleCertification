package academy.learn.programming;

public class TernaryOperator {
    public static void main(String[] args) {
        int x = 10;
        int y ;

        if(x > 5) y = 2 * x;
        else y = 4 * x;

        System.out.println("Y = " + y);

         y = (x > 5) ? (2 * x) : (4 * x);

         y = 1;
        System.out.println(y > 5 ? 10 : "test");
//        int h = y < 10 ? 5 : "test"; doesn't compile

        int a = 1;
        int b = 1;
        int c = a > 10 ? a++ : b++;

        System.out.println("A = " + a + ", B = "+ b + ", C = "+ c);

        int d = 1; // 2
        int i = 2; // 2
        int f = 3; // 3

        if(d < 10) f = d++ < 1 ? i++ : f++; // f = f
        else f = (d + i ) < 2 ? d++ : i++;

        System.out.println("D = " + d + ", I = "+ i +", F = "+ f);


    }
}
