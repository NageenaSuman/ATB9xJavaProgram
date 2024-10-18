package Oct_Exercises.exe_18102024;
import java.util.Scanner;
public class Lab_019_Months {
    public static void main(String[] args) {
        System.out.println("Enter the number and i will tell you what month it is: ");
        Scanner s1 = new Scanner(System.in);
        int n1 = s1.nextInt();
        switch (n1) {
            case 1 -> System.out.println("The month is January");
            case 2 -> System.out.println("The month is February");
            case 3 -> System.out.println("The month is March");
            case 4 -> System.out.println("The month is April");
            case 5 -> System.out.println("The month is May");
            case 6 -> System.out.println("The month is June");
            case 7 -> System.out.println("The month is July");
            case 8 -> System.out.println("The month is August");
            case 9 -> System.out.println("The month is September");
            case 10 -> System.out.println("The month is October");
            case 11 -> System.out.println("The month is November");
            case 12 -> System.out.println("The month is December");
            default -> System.out.println("Entered no is invalid");
            }
        }


}
