/**
 * Created by catenate on 26/02/2020.
 */
public class ReturnAndFinally {

    public static void main(String[] args) {

        System.out.println(calculate());
        System.out.println(say());
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



    public static String say(){
        try {
            System.out.println("gonna throw");
            throw new RuntimeException();
          //  System.out.println("threw..");  unreachable statement

        } finally {

            System.out.println("done");
            // return "done"; with the return statement the exception is not thrown, even thogh there isn't a catch statement
        }
    }
}
