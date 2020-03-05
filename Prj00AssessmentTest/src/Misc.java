import java.util.*;


public class Misc {

    public static void main(String[] args) {
        int[] array = {6,9,8};  // The array is allowed to use an anonymous
                                 // initializer because it is in the same line as the declaration.

        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        list.add(array[2]);
        list.set(1, array[1]);
        list.remove(0);
        System.out.println(list);
    }

}
