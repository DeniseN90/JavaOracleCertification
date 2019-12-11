package academy.learn.programming;

public class VariableScope {

    static int myGlobalInt;

    public static void main(String[] args) {

        // int anotherInt = 35;
        int myLocalInt = 10;

        {
//            int myLocalInt = 8;
            int myOtherInt = 2;
            int anotherInt = 30;

            System.out.println(myLocalInt);
            System.out.println(myOtherInt);
        }
        // System.out.println(myOtherInt);
        System.out.println(myGlobalInt);
        System.out.println(myLocalInt);

        int myOtherInt = 7;
        int anotherInt = 35;
        System.out.println(myOtherInt);
        System.out.println(anotherInt);




    }

    public void myMethod() {
//        System.out.println(myLocalInt); myLocalInt is not in range
    }
}
