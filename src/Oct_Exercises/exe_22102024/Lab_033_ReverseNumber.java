package Oct_Exercises.exe_22102024;
import java.util.Scanner;
public class Lab_033_ReverseNumber {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the choice of your number to reverse it: ");
        int number = s1.nextInt(), reverse = 0;
        //we have not mentioned the initialization part of the for loop
        for( ;number != 0; number=number/10)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);


    }
}
