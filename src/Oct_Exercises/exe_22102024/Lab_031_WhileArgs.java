package Oct_Exercises.exe_22102024;

public class Lab_031_WhileArgs {
    public static void main(String[] args) {
        String s= args[0];
        int i = Integer.parseInt(s); //inbuilt function to convert from string to int as args in cli take only string
        while ( i > 20) {
            System.out.println("Age is" + i);
            i --;
        }
    }
}
