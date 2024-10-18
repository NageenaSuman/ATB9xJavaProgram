package Oct_Exercises.exe_17102024;
import java.util.Scanner;

public class Lab_016_GradesCalc {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Score:");
        float score = s1.nextFloat(); char grade = 'S';
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if (score >= 0 && score <= 59) {
            grade = 'F';
        }
        else if (score <=0 || score > 100){ // Extra condition for Edge case
            System.out.println("Invalid Score");
            grade = 'I';
        }
        System.out.println("Your grade is: " + grade);
        s1.close(); // closing the scanner is best practise but still the garbage collection will do it if you dont do it


    }
}
