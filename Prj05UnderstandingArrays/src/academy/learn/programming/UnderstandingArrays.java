package academy.learn.programming;

public class UnderstandingArrays {
    public static void main(String[] args) {
        int[] arr = new int[3]; // array with 3 elements initialized to 0
        int[] anotherArr = new int[] {3,6,12}; // redundant
        int [] arrThree = {7,9,12};

        double[] b = new double[4*5/2]; //creates a double arr of 10 elements

        int x = 6;
        int y = 4;

        double[] c = new double[x*y];

        // we can also use anonymous arrays, without specifying the type on the right side
        int [] three = {5,9,15};

        int [] four = {}; //size is 0 and can't change


        int[]a;
        int a2 []; //both are legal

        int[] ids, types; //create 2 arrays, but it's bad practice
        int ids2[], types2; //create 1 array and 1 int

        
    }
}
