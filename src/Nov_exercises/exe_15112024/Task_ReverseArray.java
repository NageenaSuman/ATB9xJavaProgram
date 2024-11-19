package Nov_exercises.exe_15112024;

import java.util.Arrays;

public class Task_ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        int[] rev_arr = new int[arr.length];
        int j = 1;
        for (int i = 0; i<arr.length; i ++){
            rev_arr[i] = arr[arr.length - j];
            j++;
            System.out.print(rev_arr[i]);
        }

    }
}
