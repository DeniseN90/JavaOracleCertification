package academy.learn.programming;

/**
 * Created by catenate on 23/01/2020.
 */
public class MethodsWithVarargs {

    public void walk1(int...nums) { }
    public void walk2(int start, int... nums) { }
//    public void walk3(int... nums, int start) { } // DOES NOT COMPILE
//    public void walk4(int... start, int... nums) { } // DOES NOT COMPILE

    public static void walk(int start, int... nums) {
        System.out.println(nums.length);
        }






    public static void main(String[] args) {
        walk(1); // 0  empty array created by Java
        walk(1, 2); // 1



        walk(1, 2, 3); // 2  1 is start, 2 and 3 are nums
        walk(1, new int[] {4, 5}); // 2 redundant
        }

}
