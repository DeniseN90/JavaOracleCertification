package academy.learn.programming;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        // 1D
        int [] myArray = {3,7};

        // 2D
        int[][] arr = new int [2][4]; // 2 rows and 4 columns

        int [] otherArr[] = new int[2][4] ; // compiles but it's confusing

        String [][] twoDArray = new String[][] {
                {"One","Two"},
                {"Three", "Four","Five"},
                {"Six", "Seven", "Eigth", "Nine"},
                null
        };

        // 3D
        int [][][] threeDArray = new int[3][3][3];

        int [] another3DArray[][]; // compiles but it's confusing

        // initialization
        int [][][] threeDimensionalArray = {
                {{1,2,3}, {4,5,6}, {7,8,9}},
                {{10,11,12}, {13,14,15}, {16,17,18}},
                {{19,20,21}, {22,23,24}, {25,26,27}}
        };

    }
}
