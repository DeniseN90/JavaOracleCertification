public class MathFunctions {

    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        MathFunctions.addToInt(a, b);
        System.out.println(a);
    }


    // only a copy of the parameter is passed into the method, therefore a value will remain 15
    // we could obtain 25 as output if we change the return type from void o int and have it printed it
}