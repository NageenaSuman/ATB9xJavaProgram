package Nov_exercises.exe_15112024;

public class TryandCatch {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        try {
            b = 10/c;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Not able to divide");
        }


    }
}
