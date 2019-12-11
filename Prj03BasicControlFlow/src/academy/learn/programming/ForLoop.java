package academy.learn.programming;

public class ForLoop {
    public static void main(String[] args) {


        for(int i = 0; i < 10; i ++)
            System.out.print(i);

//        System.out.println(i); won't compile,
//        cause i can be used just inside the for loop
        int a;
        for(a = 0; a < 10; a ++)
            System.out.print(a);

        System.out.println(" " + a);

        /*for(;;){

        }*/ // infinite loop

        int x = 0;
        for (int y = 0, z = 4; x < 5 && y < 10; x++, y++){
            System.out.println("Y = " + y);
        }

        System.out.println("X = " + x );

        /*int d = 10;
        for(int i = 0, d = 0; a < 10 || d < 10; a ++, d -- ){

        }*/ //won't compile because d is declared 2 times

        /*for(long z = 0, int d = 4; z < 10; z++,d++)*/ // you can't initialize variables of different data type



      /*  for(int i = 0; i <10;){
            i = i++;
            System.out.println("HELLO");
        }*/ // infinite loop

        int count = 0;
        ROW_LOOP: for(int row = 1; row <= 3; row++)
            for(int col = 1; col <= 2; col++){
                if(row*col %2 == 0) continue ROW_LOOP;
                count++;
            }
        System.out.println("Count = " + count);
    }
}
