package test;

public class Tolls {
    private static int yesterday = 1;
    int tomorrw = 10;

    public static void main(String[] args) {
        Tolls tolls = new Tolls();
        int today = 20, tomorrow = 40;
        System.out.println(today + tolls.tomorrw + tolls.yesterday); //
    }
}
