package academy.learn.programming;

public class UsingStringBuilder {
    public static void main(String[] args) {
        String sOne = "";

        for(char c = 'a'; c <= 'z'; c++){
            sOne += c;  // this line will create a new string object each time
        }

        System.out.println(sOne);

        StringBuilder sb = new StringBuilder();
        for (char a = 'a'; a <= 'z'; a ++){
            sb.append(a); //it will return the same object, not create a new one
        }

        System.out.println(sb);

        StringBuilder builder = new StringBuilder("start");
        builder.append("-middle");
        StringBuilder anotherBuilder = builder.append("-end");

        System.out.println(builder);
        System.out.println(anotherBuilder);

        System.out.println(builder == anotherBuilder);
        System.out.println(System.identityHashCode(builder));
        System.out.println(System.identityHashCode(anotherBuilder));

        StringBuilder mSBuilder = new StringBuilder();
        System.out.println("size = " + mSBuilder.length());
        System.out.println("capacity = " + mSBuilder.capacity());

        mSBuilder = new StringBuilder(100);
        System.out.println("size = " + mSBuilder.length());
        System.out.println("capacity = " + mSBuilder.capacity());

        mSBuilder.append("Test");
        System.out.println("size = " + mSBuilder.length());
        System.out.println("capacity = " + mSBuilder.capacity());

        StringBuilder a = new StringBuilder("This ");
        StringBuilder b = a.append("Java ");
        b = b.append("is ").append("so ").append("Cool");
        System.out.println(a);
        System.out.println(b);

//        StringBuilder v = "Fluffy"; won't compile
    }
}
