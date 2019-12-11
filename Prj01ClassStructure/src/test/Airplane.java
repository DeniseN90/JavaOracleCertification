package test;
import academy.learn.programming.AssignmentOperators;

public class Airplane {
    static int start = 2;
    final int end;
    public String s = "Instance string";
    public Airplane(int x ){
        x = 4;
        end = x;
        System.out.println("X = " + x);
    }
    public void fly(int distance){
        System.out.println(end - start + " ");
        System.out.println(distance);
    }

    public static int sum(int y ){
        y =  y + 15;
        System.out.println("Y = "+ y);
        return y;
    }
    public static String changeObj (String g){
        g = g + "Changed";
        System.out.println(g);
        return g;
    }

    private static void hello(String t) {
        t = "hello " + t;
        System.out.println(t);
    }
    public void attach(){
       // public String clo; doesn't compile
    }

    public static void main(String[] args) {
        new Airplane(10).fly(5);
        sum(10);
        changeObj("Plane");
        hello("Hello");
        String l = "variable";
        hello(l);
        System.out.println(l);

    }
}
