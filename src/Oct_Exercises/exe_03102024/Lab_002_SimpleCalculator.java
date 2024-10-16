package Oct_Exercises.exe_03102024;
import java.util.Scanner;
public class Lab_002_SimpleCalculator {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the value of a and b:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Enter the operation to be performed:Addition/Subtraction/Multiplication/Division");
            String op = sc1.nextLine();
            if (op.equals("Addition")) {
                int c = a + b;
                System.out.println("The Result is:" + c);}
            else if (op.equals("Subtraction")) {
                int c = a - b;
                System.out.println("The Result is:" + c);}
            else if (op.equals("Multiplication")) {
                int c = a * b; System.out.println("The Result is:" + c);}
            else if (op.equals("Division")) {
                float c = a / b;
                System.out.println("The Result is:" + c); }
            }

        }


