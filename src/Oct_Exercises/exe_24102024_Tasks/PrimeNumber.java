package Oct_Exercises.exe_24102024_Tasks;

import java.util.Scanner;
class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Please enter the number to find prime numbers till it:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The prime numbers upto " + num + " are:" );
        prime(num);

    }
    static void prime(int num) {

        int i,j;
        for (i=2; i<=num; i++) {
            int count = 0;
            for (j=1; j<=i; j++) {
                if (i%j == 0) {
                    count ++;
                }
            }
            if (count ==2) {
                System.out.print( i + " ");
            }
        }
    }
}
