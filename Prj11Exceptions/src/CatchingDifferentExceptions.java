class MuseumClosed extends RuntimeException {
}

class MuseumClosedForLunch extends MuseumClosed {
}
public class CatchingDifferentExceptions {

    public static void main(String[] args) {
        try {
            visitMuseum();

            // you need to catch the subclass first, otherwise you get compile error
        } catch (MuseumClosedForLunch mc ) {
            System.out.println("Closed for lunch, come back in 2 hours");
        } catch (MuseumClosed mc ) {
            System.out.println("Closed");
        }

        System.out.println(calculate());

    }

    public static void visitMuseum(){
        boolean b = Math.random() < .5;
        if(b) {
            throw new MuseumClosed();
        } else {
            throw new MuseumClosedForLunch();
        }
    }

    public static String calculate(){
        String result = "";
        String str = null;
        try {
            try {
                result += "start";
                str.length();
                result += "end";
            } catch (NullPointerException e) {
                result += "npe";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }

        } catch (Exception ex){
            result += "finished";
        }

        return result;
    }
}
