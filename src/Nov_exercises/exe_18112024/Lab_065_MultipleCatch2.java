package Nov_exercises.exe_18112024;

public class Lab_065_MultipleCatch2 {
    public static void main(String[] args) {
        int b = 0; // ArithmeticException
        try {
            String ip = args[0]; // ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            b = 1000/a;
        } catch (ArithmeticException| NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
