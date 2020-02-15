package academy.learn.programming.questions;

abstract class Triangle {
    abstract String getDescription();
}
class RightTriangle extends Triangle {
    protected String getDescription() { return "rt"; } // g1
}
public abstract class IsoscelesRightTriangle extends RightTriangle { // g2
    public String getDescription() { return "irt"; }
    public static void main(String[] edges) {
//        final Triangle shape = new IsoscelesRightTriangle(); // g3 instantiating abstract class
//        System.out.print(shape.getDescription());
    }
}