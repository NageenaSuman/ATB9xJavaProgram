package Oct_Exercises.exe_21102024;

public class Lab_021_ForLoop1 {
    public static void main(String[] args) {
        System.out.println("Simple For Loop");
        for (int i = 0;i < 10; i++){
            System.out.println(i); //10 times will execute
        }
        for (int i=1; i<=10; i++){
            System.out.println("i->"+ i); //11 times will execute as we have used = in condition
        }
    }
}
