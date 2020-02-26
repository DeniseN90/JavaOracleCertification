/**
 * Created by catenate on 26/02/2020.
 */
public class ReturnAndFinally {

    public static void main(String[] args) {

        System.out.println(calculate());
    }

    public static int calculate(){
        try {
            // System.exit(0);
            return 10/0;
        } catch (ArithmeticException ex) {
            System.out.println("Error");
           // System.exit(0);
            return 1;
        } finally {
            System.out.println("finally");
        //    return 0;
        }
    }
}
