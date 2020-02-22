public class TryCatchExceptions {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = divide(a,b);
            System.out.println( "result = " +result );
        } catch (ArithmeticException e) {
         //   e.printStackTrace();
            System.out.println("Exception: " +e.getMessage());
            System.out.println("Exception: " +e.getCause());
        }
    }

    private static int divide (int a, int b) {
        return a/b;
    }
}
