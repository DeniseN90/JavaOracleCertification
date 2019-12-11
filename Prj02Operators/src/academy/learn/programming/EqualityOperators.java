package academy.learn.programming;

public class EqualityOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        boolean c = a == b;
        boolean d = a != b;

        System.out.println("C = " + c + ", D = "+ d);

//        boolean g = true == 0  doeasn't compile

        boolean x = true;
        boolean y = false;
       boolean z = (y = true) && (x = false); // it compiles, but that's an assignment, not comparison
        System.out.println("Z = "+ z + " Y = "+ y + " X = "+ x);

        z = (y != true) && (x = false); // in this case the second part won't be executed and x will remain true

    }
}
