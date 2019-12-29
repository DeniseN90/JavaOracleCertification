package academy.learn.programming;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] names = {"Jim", "Sara", "Luis"};
        for(String name: names){
            name = name + " " + name;  // can't change a local variable in a for loop (value passed through reference to loop variable
        }

        System.out.println(Arrays.toString(names));

        StringBuilder[] builders = {
                new StringBuilder("For"),
                new StringBuilder("Loop")
        };

        for(StringBuilder s : builders){
            System.out.println(s);
            s.append("123");
            System.out.println(s);
        }

        String pet = "parrot";
        for(char c : pet.toCharArray()){
            System.out.println(c);
        }
    }
}
