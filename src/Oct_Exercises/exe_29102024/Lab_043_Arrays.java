package Oct_Exercises.exe_29102024;
import java.util.Arrays;
public class Lab_043_Arrays {
    public static void main(String args[]) {
        int[] marks = {12,13,14,18}; // 1. Fixed values being declared
        System.out.println(marks[3]);
        System.out.println(marks.length); // length always counts from 1

        String[] names = {"Nageena", "Suman", "PK"};
        System.out.println(names[2]);

        int[] marks_1 = new int[8]; // 2. size being declared without values
        marks_1[0] = 100;
        marks_1[1] = 90;
        marks_1[2] = 80;
        marks_1[3] = 70;
        System.out.println(marks_1.length);
        System.out.println(marks_1[3] + marks_1[5]);
        System.out.println(marks_1[7]);

        boolean[] is_male_data = new boolean[2];
        is_male_data[0] =  true;
        is_male_data[1] =  false;
        System.out.println(is_male_data[1]);

        //Iteration to print in loop

        int[] marks2 = {34,100,98,65,76,77};
        Arrays.sort(marks2);//ascending to descending
        System.out.println("The sorted marks are:");
        for (int i=0; i<marks2.length; i++) {

            System.out.println(marks2[i]);
        }

        int item_index = Arrays.binarySearch(marks2, 100);
        System.out.println(item_index);

    }
}
