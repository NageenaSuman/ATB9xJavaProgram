package Oct_Exercises.exe_18102024;
import java.util.Scanner;
public class Lab_018_SwitchStatement {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Choose and enter the operation to perform:Addition/Subtraction/Multiplication/Division/Modulus :-");
        String op = s1.nextLine().toLowerCase();
        System.out.println("Please enter the numbers: ");
        double n1 = s1.nextDouble();
        double n2 = s1.nextDouble();
        switch(op){
            case "addition": {
                System.out.println("Addition:" + (n1 + n2));
                break;
            }
            case "subtraction": {
                System.out.println("Subtraction:" + (n1 - n2));
                break;
            }
            case "multiplication": {
                System.out.println("Multiplication:" + (n1 * n2));
                break;
            }
            case "division": {
                System.out.println("Division:" + (n1 / n2));
                break;
            }
            case "modulus", "mod": { //modulus = dividend(left no) - (quotient * divisor) // 100  % 10 // mod = 10 - (0 * 100) = 10
                System.out.println("Mod:" + (n1 % n2));
                break;
            }
            default:
                System.out.println("Enter the valid numbers");

        }




    }
}
