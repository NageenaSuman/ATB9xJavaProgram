package Nov_exercises.exe_15112024;

public class Task_ReverseArray_While {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] rev_arr = new int[arr.length];
        int i=0; int j = 1;
        while (i < arr.length){
            rev_arr[i] = arr[arr.length - j];

            j++;
            System.out.print(rev_arr[i] + " ");
            i++;
        }
      
    }
}
