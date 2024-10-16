package Oct_Exercises.exe_15102024;

public class Lab_013_PrePostInDe {
    public static void main(String[] args) {
        int a = 20;
        int result = --a + a++ + a--; // 19 + 19 + 20
        System.out.println("The value of final expression - [—a + a++ + a—] is: " + result );
    }
}
