package academy.learn.programming;

public class AssignmentOperators {

    public static void main(String[] args) {

       //  int x = 1.0; doesn't compile

 //        int z = 9f; doesn't compile

        int z = (int) 9f;  // casting

        short y = (short) 87878787; //overflow

        System.out.println("Y = " + y);

        byte c = 127;
        byte d = -128;
        System.out.println("C = "+ c + ", D = "+ d);

//        c = c + 1 ; doesn't compile cause short is promoted to int

        c++; // overflow
        d--; // underflow

        System.out.println("C = "+ c + ", D = "+ d);

        short a = 10;
        short b = 20;
//        short k = a + b;

        short k = (short) (a + b);


    }
}