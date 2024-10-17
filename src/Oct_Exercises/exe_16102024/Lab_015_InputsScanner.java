package Oct_Exercises.exe_16102024;
import java.util.Scanner;
public class Lab_015_InputsScanner {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Name:");
        String name =  s1.nextLine();
        System.out.println("Enter the Age:");
        byte age = s1.nextByte();
        System.out.println("Enter the salary:");
        float sal = s1.nextFloat();

        System.out.println("The details entered are:" + '\n' + "Employee Name: " + name + '\n' + "Employee Age: " + age + '\n' + "Employee Salary: " + sal  );
        s1.close();
    }

}
