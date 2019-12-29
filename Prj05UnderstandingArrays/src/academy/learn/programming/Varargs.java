package academy.learn.programming;

import java.util.Arrays;

public class Varargs {
    /**
     * this is varargs and
     * it is used to define
     * an array of undefined length
     * @param args
     */
    public static void main(String...args) {
        System.out.println(args.length);
        System.out.println(Arrays.toString(args));

        print(args);
        print("java");  // you don't need to pass an array,
                        // but you can use as many arguments as you want (same type)

    }

    private static void print(String...args){
        for(String s : args){
            System.out.println(s);
        }
    }
}
