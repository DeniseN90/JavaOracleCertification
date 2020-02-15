package academy.learn.programming.questions;interface Sphere {
    default String getName() { return "Unknown"; }
}
abstract class Planet {
    abstract String getName();
}
//public class Mars extends Sphere implements Planet { // implements Planet??
//    public Mars() {
//        super();
//    }
//    public String getName() { return "Mars"; }
//    public static void main(final String[] probe) {
//        System.out.print(((Planet)new Mars()).getName());
//    }
//}

