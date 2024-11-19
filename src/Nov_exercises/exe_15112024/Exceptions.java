package Nov_exercises.exe_15112024;

public class Exceptions {
    public static void main(String[] args) {
        String i = args[0];
        int z = Integer.parseInt(i);
        System.out.println(z);  // NumberFormat Exception if you give input string

        int a = Integer.valueOf(i);
        int math = 10000/a ; // ArithmeticException if you give input as 0


        //JVM will be Initialized (From RAM)
        //Creates and Starts the main Thread. - Main Called
        //1) Collects the Command Line Arguments - 10
        // String[] args = {10} ->
        // 2) Lab174_Exception.main()
        //Now Control will be transferred from main Thread to main method
        // When problem comes in main -> JVM
        // If you don't handle the exception JVM will handle it
        // Always terminate the program with exception

    }
}
