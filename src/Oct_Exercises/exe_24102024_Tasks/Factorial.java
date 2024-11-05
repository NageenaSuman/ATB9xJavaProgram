package Oct_Exercises.exe_24102024_Tasks;
import java.util.*;
class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number to find its factorial:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        for (int i=1; i<=num; i++) {
            fact = i * fact;

        }
        System.out.println("The Factorial of given number " + num + " is:" + fact);
    }
}
