package Oct_Exercises.exe_17102024;

import java.util.Scanner;

public class Lab_017_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter the three sides of triangle: ");
        Scanner s1 = new Scanner(System.in);
        float side1 = s1.nextFloat(), side2 = s1.nextFloat(), side3 = s1.nextFloat();
        if (side1 == side2 && side2 == side3 && side1 == side3) {
            System.out.println("The entered 3 sides defines its a EQUILATERAL Triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3){
            System.out.println("The entered 3 sides defines its a ISOSCELES Triangle");
        } else {
            System.out.println("The entered 3 sides defines its a SCALENE Triangle");
        }
        s1.close();

    }
}