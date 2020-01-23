package academy.learn.programming;

/**
 * Created by catenate on 22/01/2020.
 */
public class MethodReturnType {

    public void walk1() { }
    public void walk2() { return; }
    public String walk3() { return ""; }
//    public String walk4() { } // DOES NOT COMPILE
//    public walk5() { } // DOES NOT COMPILE
//    String walk6(int a) { if (a == 4) return ""; } // DOES NOT COMPILE


    int integer() {
        return 9;
    }

    int longo() {
        return (int) 9L; // DOES NOT COMPILE WITHOUT CASTING
    }


    int integerExpanded() {
        int temp = 9;
        return temp;
    }
    int longExpanded() {
        int temp = (int)9L; // DOES NOT COMPILE WITHOUT CASTING
        return temp;
    }


    public void walkWalk() { }
//    public void 2walk() { } // DOES NOT COMPILE
//    public walk3 void() { } // DOES NOT COMPILE
    public void _Walk_$() { }
    public void $_Walk_$() { }
//    public void() { } // DOES NOT COMPILE
}
