public class UsingFinally {


    public static void main(String[] args) {
        String [] array = new String[5];

        try {
            String element = firstToUppercase(array);
            System.out.println("Element: " + element );
        } catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Finally block");
        }

        String s = "";
        try {
            s += 'a';
            // int a = 10/0;
        } catch (Exception e){
            s += 'b';
        } finally {
            s += 'c';
        }

        s += 'd';

        System.out.println(s);

    }

    public static String firstToUppercase(String [] array) {
        return array[0].toUpperCase();
    }
}
