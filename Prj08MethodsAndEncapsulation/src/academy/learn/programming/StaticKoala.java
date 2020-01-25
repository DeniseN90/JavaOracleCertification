package academy.learn.programming;

/**
 * Created by catenate on 23/01/2020.
 */
public class StaticKoala {
    static public int koalas = 2;

    public static void main(String[] args) {
        StaticKoala koala = new StaticKoala();
        System.out.println(koala.koalas);
        koala = null;                 // HE DOESN'T CARE IT IS A NULL, CAUSE A STATIC MEMBER DO NOT NEED A REFERENCE
        System.out.println(koala.koalas);
    }
}
