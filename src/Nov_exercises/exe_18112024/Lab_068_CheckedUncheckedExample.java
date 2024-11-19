package Nov_exercises.exe_18112024;
import java.io.*;
public class Lab_068_CheckedUncheckedExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally { // this block will always execute if you want to make it un executed
            // then use System.exit(0); before the catch block
            System.out.println("Unchecked!");
        }

        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Checked Exception");
        }





    }
}
