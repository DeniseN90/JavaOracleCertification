package test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s1 = "Java"; // down the pool it goes
        String s2 = "Java"; // this follows
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println( s1 == s2);
        System.out.println( s1.equals(s2));
        System.out.println( sb1.toString() == s1);
        System.out.println( sb1.toString().equals(s1) );

        int [] array = {6,9,8};
        System.out.println(array);
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        list.add(array[2]);
        list.set(1, array[1]);
        list.remove(0);
        System.out.println(list);
    }
}
