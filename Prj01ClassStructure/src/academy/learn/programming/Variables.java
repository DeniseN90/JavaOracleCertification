package academy.learn.programming;

public class Variables {

    public static void main(String[] args) {

        //** INITIALIZING AND DECLARING VARIABLES** //

        // declaring and initializing in 2 lines

        int myInt; // declaration
        // System.out.println("myInt before "+ myInt);
        // doesn't compile because it is a local variable, and it
        //is not initialized by default
        myInt = 9; // initialization
        System.out.println("myInt after "+ myInt);

        // declaring and initializing in 1 line
        double myDouble = 5.78;


        //declaring multiple variables
        float f1, f2, f3; // just don't do it, but you can

        float f4; float f5;

        // declaring and initializing on the same line
        float f6 = 6.9f; float f7 = 7.8f; float f8;

//        double d1, double d2; doesn't compile
          double d1; double d2;

//        int i3; i4; doesn't compile'

        String s1 = "Yes", s2 = "No", s3, s4;

//        int num, String value; doesn't compile

        // **IDENTIFIERS** //

        float $Float = 67.89f;
        double _double1 = 98.7;


        // illegal names
//        int 6yt = 9; doesn't compile

//        char gt@yu = 'y'; doesn't compile

//        float *cof = 89.9F; doesn't compile

        float g; double l;

        char hy$fr;
    }
}
