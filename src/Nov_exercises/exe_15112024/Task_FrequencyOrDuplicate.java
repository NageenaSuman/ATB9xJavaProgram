package Nov_exercises.exe_15112024;

public class Task_FrequencyOrDuplicate {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,7,7,2,1,1,4};

        int count = 1;
        int size = arr.length;
        int num[] = new int[size];
        for (int i =0; i<size; i++) { //for the number of loop in array
            for (int j = i +1; j<size; j++) {
                if (arr[i] == arr[j]) {
                    count ++;



                }

            }System.out.println(arr[i] + " - " + count);



        }


    }
}
