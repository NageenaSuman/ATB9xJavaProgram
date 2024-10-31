package Oct_Exercises.exe_30102024;

public class Lab_049_2DArrayMatrix {
    public static void main(String[] args) {
        int[][] _2Dmat = new int [2][3];
        // First Row
        _2Dmat[0][0] = 1;
        _2Dmat[0][1] = 2;
        _2Dmat[0][2] = 56;
        // Second Row
        _2Dmat[1][0] = 4;
        _2Dmat[1][1] = 5;
        _2Dmat[1][2] = 878;

        //Iterating
        for (int i = 0; i < _2Dmat.length; i++) { // if same rows and columns no matter what yu can use variable.length but different size use as below
            for (int j = 0; j< _2Dmat[i].length; j++) { //always use variable[i].length --> row length to complete it
                System.out.print(_2Dmat[i][j] + " ");
            }
            System.out.println();
        }




        //int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //int[][] martix_3_2 = {{1, 2}, {3, 4}, {5, 6}};
        //int[][] martix_3_1 = {{1}, {3}, {5}};
        //int[][] martix_2_2 = {{1, 2}, {3, 4}};
    }
}
