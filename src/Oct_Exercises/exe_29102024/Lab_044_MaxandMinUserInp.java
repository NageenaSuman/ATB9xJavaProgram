package Oct_Exercises.exe_29102024;
import java.util.Scanner;
public class Lab_044_MaxandMinUserInp {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array in which you want to find the Maximum of it:");
        Scanner sc = new Scanner(System.in);
        int [] dig =new int[sc.nextInt()];
        int [] num = new int [dig.length];
        int ch = num[0];
        System.out.println("Now enter the numbers:");
        for (int i =0; i<dig.length; i++) {
            num[i] = sc.nextInt();
            if(num[i] > ch ) {
                ch = num[i];
            }
        }
        System.out.println("Max is:" + ch );
        ch = num[0];
        for (int i =0; i<dig.length; i++) {

            if (num[i] < ch){
            ch = num[i];
            }

        }
        System.out.println("Min is:" + ch);
}}
