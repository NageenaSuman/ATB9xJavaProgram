package Oct_Exercises.exe_30102024;
import java.util.Scanner;

public class Lab_051_LeftHandTriangle {
    public static void main(String[] args) {
        System.out.println("Enter no of rows for LH triangle:");
        Scanner sc = new Scanner(System.in);
        int[] arr_size = new int[sc.nextInt()];
        for (int i = 0; i < arr_size.length; i++) {
            for (int j = i ; j < arr_size.length; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
