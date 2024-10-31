package Oct_Exercises.exe_30102024;
import java.util.Scanner;
public class Lab_051_RightHandTriangle {
    public static void main(String[] args) {
        System.out.println("Enter no of rows for RH triangle:");
        Scanner sc = new Scanner(System.in);
        int[] arr_size = new int[sc.nextInt()];
        for (int i = 0; i < arr_size.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
