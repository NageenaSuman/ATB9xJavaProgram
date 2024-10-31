package Oct_Exercises.exe_29102024;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_046_DuplicatesInArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();
        int [] num = new int[size];

        System.out.println("Enter the values of array you want to find duplicates:");

        for (int i = 0; i<size; i++) {
            num[i] = sc.nextInt();
        }
        for (int j = 0; j<num.length; j++) {
            for (int k = j+1; k < num.length; k++) {

                if (num[j] == num[k]) {

                    System.out.println("Duplicate found");

                }

            }
        }
    }}

