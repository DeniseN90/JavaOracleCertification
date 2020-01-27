package academy.learn.programming;

public class ReturningDataFromMethods {

    public static void main(String[] args) {
        int number = 2;
        String word = "xyz";

        number(number);
        System.out.println(number);

        word(word);
        System.out.println(word);

        number = number(number);
        System.out.println(number);

        word = word(word);
        System.out.println(word);


    }

    public static int number(int number) {
        number++;
        return ++number;
    }

    public static String word (String word){
        word += "A";
        return word;
    }
}