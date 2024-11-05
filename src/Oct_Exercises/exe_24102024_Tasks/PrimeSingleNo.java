package Oct_Exercises.exe_24102024_Tasks;

import java.util.Scanner;

public class PrimeSingleNo {
    public static void main(String arg[])
    {
        int i,count;
        System.out.print("Enter n value to check prime or not: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean stat = true;
        for(int j=2;j<n;j++) // this iteration is for n number
        {

            if(n%j == 0) {
                stat = false;

            }

        }
        if (stat == false) {
        System.out.println("Not a prime number:" + n); }
        else {
            System.out.println("Its a prime number:" + n);
        }
    }
}