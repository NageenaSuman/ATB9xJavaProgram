package Oct_Exercises.exe_21102024;

public class Lab_028_BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if(i==3) {
                System.out.println("Breaking the loop");
                break;
            }
        }
        for (int i = 0; i <= 5; i++) {
            //System.out.println("hi");
            if (i == 4) {
                System.out.println("Continuing the loop");
            }
            System.out.println(i);
        }
    }
}
