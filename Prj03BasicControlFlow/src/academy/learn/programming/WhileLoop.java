package academy.learn.programming;

public class WhileLoop {
    public static void main(String[] args) {
        int space = 5;
        while(space > 0){
            space--;
            System.out.println("Space = " + space);
        }
        System.out.println("Space = " + space);

       /* while(true)
            System.out.println("true");*/
        //infinite loop

        int x = 2;
        int y = 5;
        while(x < 10){
            y++;
            x++;
        }

        System.out.println("X = "+ x + ", Y = " + y);
        int a = 5;
        int b = 7;
        //this block will never execute
        while (a > 6){
            b += 2;
            a++;
        }

        a = a > 6 ? a++ : b--;  // a = 7, b = 6

        System.out.println("A = " + a + ", B = " + b + ", A + B " + (a + b));
    }


}
