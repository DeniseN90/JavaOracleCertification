package academy.learn.programming;

public class ConditionalOperators {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean g = false;

        boolean d = a && !b; // short circuit
        boolean e = g ^ b;
        boolean f = a || b;

        System.out.println("D = "+ d + " ; E "+ e + " F = "+ f);

        int h = 4;
        boolean m = false && (h++ < 4); // the second part is not evaluated in this case
        boolean o = (h-- == 4) && !m;

        System.out.println("H =  "+ h + ", M =  " + m + " O = " + o);

        int myInt = 3;
        int anotherInt = 4;
        boolean myBoolean = (myInt <= 3) && (anotherInt-- == 4) || (myInt++ == 4);
        System.out.println("Boolean = "+ myBoolean + " myInt = " + myInt + "  otherInt = "+ anotherInt);

        boolean x = true, z = false;
        int y = 20;
        x = (y != 10) ^ (z = false);

        System.out.println("X = "+ x + " Z = "+ z + " Y = "+ y);
    }
}
