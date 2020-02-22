public class CheckedVsUnchecked {


    public static void main(String[] args) {
      //  myMethod();
        myOtherMethod();

    }

    // checked exception, need to be handled
    public static void myMethod() throws Exception {
        throw new Exception("Throwing exception");
    }

    // unchecked exception, not need to handle it
    public static void myOtherMethod() throws RuntimeException {
        throw new RuntimeException("Throwing exception");
    }


}
