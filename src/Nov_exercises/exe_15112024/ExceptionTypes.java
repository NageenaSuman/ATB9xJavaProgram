package Nov_exercises.exe_15112024;

import java.io.FileInputStream;

public class ExceptionTypes {
    public static void main(String[] args) {

        // Checked - JVM Knows
        //FileInputStream file = new FileInputStream("C://a.txt");
        // JVM knows that this may lead to file not found exception
        // so it telling to handle it.

        // UnChecked JVM Doesn't know it.
        int a = 10;
        int b = 10;
        b = 0;
        int c = a / b;
        System.out.println(c);

        //Unchecked
        String s1 = null;
        System.out.println(s1.trim()); //NullPointerException

    }
}
