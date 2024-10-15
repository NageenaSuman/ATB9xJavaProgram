package Oct_Exercise_mainMethod.exe_15102024;
import java.util.Scanner;

public class Lab_011_TernaryIncDecOperators {
    public static void main(String[] args) {
        // Maximum of three numbers using nested ternary operator
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the first no: ");
        int inp1 = s1.nextInt();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter the second no: ");
        int inp2 = s2.nextInt();

        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter the third no: ");
        int inp3 = s3.nextInt();

        int max_no = (inp1 > inp2 ) ? (inp1 > inp3 ? inp1 : inp3) : (inp2 > inp3 ? inp2 : inp3);
        System.out.println("Max of three numbers: " + max_no);
    }
}
