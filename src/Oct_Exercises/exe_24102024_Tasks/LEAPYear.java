package Oct_Exercises.exe_24102024_Tasks;
import java.util.Scanner;
public class LEAPYear {
    public static void main(String[] args) {
        System.out.println("Enter the year to find LEAP/Century year or not:");
        Scanner sc = new Scanner(System.in);
        int year  = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                System.out.printf("The given year is both LEAP and Century Year:" + " %d", year);
            }
            else {
                System.out.printf("The given year is just LEAP Year:" + " %d", year);
            }

        }
        else {
                System.out.printf("Not a LEAP Year:" + " %d",year);
            }

        }
        }



