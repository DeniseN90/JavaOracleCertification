package academy.learn.programming;

public class DoWhileLoop {
    public static void main(String[] args) {
        int a = 0;

        do{
            a++;
        } while (false);

        System.out.println("A = " + a); // 1


       /* while(false){ using true would make it an infinite loop
            a++;
        }*/  // will not compile, cause the statement in the brackets is not reachable

        int x = 20;

        while (x > 10) x --;
        System.out.println("X = " + x);

        int y = 20;
        do y--; while (y > 10);

        System.out.println("Y = " + y);

        int w = 10;
        int z = 5;

        while(w < 20)
            w++;
            z += 2;  //not inside the loop
            w  += 10; //not inside the loop

        System.out.println("W = " + w + ", Z = " + z);

        a = 10;
        /*while(a > 10){
            a--;
        }
        do {
            a --;
            while(a > 5){
                a += 1;
            }
        } while (a < 10);*/ //endless loop

        while(a > 10){
            a--;
        }
        do {
            a --;
            while(a > 5){
                a  -= 1;
            }
        } while (a > 10);


        System.out.println("A = " + a);


    }
}
