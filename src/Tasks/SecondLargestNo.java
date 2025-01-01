package Tasks;

import java.util.Scanner;

public class SecondLargestNo {

    public static void main(String[] args) {
        System.out.println("Enter the size of an array to find second largest of it:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num = new int[size];
        int ch = num[0];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
            if (num[i] > ch) {
                ch = num[i];
            }
        }
        System.out.println("First largest is:" + ch);
        int ch1 = 0;
        for (int i = 0; i < size; i++) {

            if (num[i] < ch && ch1 < num[i]) {
                ch1 = num[i];
            }


        }
        System.out.println("Second largest is:" + ch1);
    }}
