package Oct_Exercises.exe_17102024;
import java.util.Scanner;

public class Lab_016_GradesCalc {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Score:");
        float score = s1.nextFloat();
        if (score >= 90 && score <= 100) {
            System.out.println("Your grade is: A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Your grade is: B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Your grade is: C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Your grade is: D");
        } else if (score >= 0 && score <= 59) {
            System.out.println("Your grade is: F");
        } else {
            System.out.println("No score has been entered");
        }
        s1.close(); // closing the scanner is best practise but still the garbage collection will do it if you dont do it


    }
}
