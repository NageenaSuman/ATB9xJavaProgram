package Oct_Exercises.exe_23102024;
import java.util.Scanner;
public class Lab_035_UserInputFunction {
    public static void main(String[] args) {
        math();

    }

    static float math() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Choose: Add/Sub/Mul/Div/Mod");
        String op = s1.nextLine().toLowerCase();
        System.out.println("Enter the number to perform arithmetic operations");
        float a = s1.nextFloat();
        float b = s1.nextFloat();

        float res = 0;
        switch (op) {
            case "add": {
                res = a + b;
                System.out.println("Addition:" + res);
                return res;

            }
            case "sub": {
                res = a - b;
                System.out.println("Subtraction:" + res);
                return res;

            }
            case "mul": {
                res = a * b;
                System.out.println("Multiplication:" + res);
                return res;

            }
            case "div": {
                res = a / b;
                System.out.println("Division:" + res);
                return res;

            }
            case "mod": { //modulus = dividend(left no) - (quotient * divisor) // 100  % 10 // mod = 10 - (0 * 100) = 10
                res = a % b;
                System.out.println("Mod:" + res);
                return res;

            }
            default:
                System.out.println("Enter valid operation or numbers");

        }

        return res;
    } }
