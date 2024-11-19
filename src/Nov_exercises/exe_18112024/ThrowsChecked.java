package Nov_exercises.exe_18112024;

import java.io.FileInputStream;

public class ThrowsChecked {
    public static void main(String[] args) { //throws using try and catch for checked exception
        try {
            FileInputStream fileInputStream = new FileInputStream("C://a.log");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}