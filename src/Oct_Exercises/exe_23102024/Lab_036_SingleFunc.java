package Oct_Exercises.exe_23102024;

import java.util.Scanner;

public class Lab_036_SingleFunc {
    public static void main(String[] args) {
        System.out.println("Enter numbers:");
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        int b = s1.nextInt();

        int res = sum(a,b);
        System.out.println("Sum is " + res);
        res = sub(a,b);
        System.out.println("Sub is " + res);
        res = mul(a,b);
        System.out.println("Mul is " + res);
        res = div(a,b);
        System.out.println("Mul is " + res);
    }

    static int sum(int a, int b) {
        return a + b;
    }
    static int sub(int a, int b) {
        return a - b;
    }
    static int mul(int a, int b) {
        return a * b;
    }
    static int div(int a, int b) {
        return a / b;
    }
}
