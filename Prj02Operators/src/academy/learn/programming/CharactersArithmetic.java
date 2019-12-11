package academy.learn.programming;

public class CharactersArithmetic {
    public static void main(String[] args) {
        char a = 'A';
        char one = '1';


        System.out.println(" A = " + a);
        System.out.println("A = " +a);
        System.out.println("B = " + one);

        System.out.println("A = " + Character.isLetter(a));
        System.out.println("A = " + Character.isDigit(a));

        System.out.println("one = " + one);
        System.out.println("one = " + Character.isLetter(one));
        System.out.println("one = " + Character.isDigit(one));

        char letter = /* (char)*/ 65; //this is an int, automatically casted to char
        int myInt = letter + 3; //68  char is automatically converted to int
        char myNewLetter = (char) myInt; //D casting of int to char

        System.out.println("Letter = " + letter); //
        System.out.println("MyInt = " + myInt); // 68
        System.out.println("MyNewLetter = " + myNewLetter);

        char charOne = 65;
//        char charTwo = charOne + 1 ; doesn't compile without casting
        char charTwo = (char) (charOne + 1) ; // -> 66
        boolean bOne = charTwo == 'B';
        boolean bTwo = charTwo++ < 'C'; // 66 - 67, but 66 is used

        System.out.println("b1 = " + bOne + ", b2 = " + bTwo);
        System.out.println("charTwo = " + charTwo);
    }
}
