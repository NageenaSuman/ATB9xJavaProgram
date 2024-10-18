package Oct_Exercises.exe_18102024;
import java.util.Scanner;
public class Lab_020_DegreeCon {
    public static void main(String[] args) {
        System.out.println("Enter the number of option for the choice of conversion:" + '\n' + "1. For Kilometer to Meter" + '\n'
                + "2. For Meter to Kilometer" + '\n' + "3. For Celsius to Fahrenheit" + '\n'
                + "4. For Fahrenheit to Celsius");
        Scanner s1 = new Scanner(System.in);
        int i = s1.nextInt(); float in, result;
        switch(i) {
            case 1: {
                System.out.println("Enter the Kilometers: ");
                in = s1.nextFloat();
                result = (in * 1000);
                System.out.println("The meters in given km is: "+ result);
                break; }
            case 2: {
                System.out.println("Enter the meters: ");
                in = s1.nextFloat();
                result = (in / 1000);
                System.out.println("The Kilometers in given meter is: "+ result);
                break; }
            case 3: {
                System.out.println("Enter the Celsius: ");
                in = s1.nextFloat();
                result = (in * 9/5) + 32;
                System.out.println("The Fahrenheit equivalent is: "+ result);
                break; }
            case 4: {
                System.out.println("Enter the Fahrenheit: ");
                in = s1.nextFloat();
                result = (in  - 32) * 5/9;
                System.out.println("The Celsius equivalent is: "+ result);
                break; }
        }
    }
}
