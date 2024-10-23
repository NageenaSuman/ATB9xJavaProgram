package Oct_Exercises.exe_21102024;

public class Lab_022_InfiniteForLoop {
    public static void main(String[] args) {
        System.out.println("Infinite For Loop");
        for (;;){
            System.out.println(""); //as condition is absent it will be infinite
        }
        //for (int i=1; ; i++){
        // infinite loop as condition is absent no matter what initialisation is present or not
        // exit code 130 (Stop by Yourself- Kill) Red Button - interrupted by signal
        // exit code 0 - Successful
        }
    }

