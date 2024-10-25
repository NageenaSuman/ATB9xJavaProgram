package Oct_Exercises.exe_25102024;

public class Lab_038_ImmutableString {
    public static void main(String[] args) {
        String s1 = "nageena";
        s1.toUpperCase();
        System.out.println(s1);
        // the converted value of upper case will be in new memory but s1 is pointing still to "nageena"

        //to fix this re-assign the value
        s1 = s1.toUpperCase();
        System.out.println(s1);


    }
}
