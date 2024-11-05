package Oct_Exercises.exe_24102024_Tasks;

import java.util.Scanner;
class Fibbo {
    public static void main(String[] args) {
        System.out.println("Please enter the number to find Fibonacci Series of it:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The FIbonacci series upto " + num + " are:" );
        findFibbo(num);

    }
    static void findFibbo(int num) {

        int n1=0;
        int n2=1;
        int n3,i;
        System.out.print(n1 + " " + n2 );

        for (i=2; i<=num; i++) {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

