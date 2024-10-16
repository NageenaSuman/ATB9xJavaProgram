package Oct_Exercises.exe_09102024;

public class Lab_005_VariableTypes {
    int gg = 98;
    {
        //it wont output as it is not under void main
        System.out.println(gg); // local variable and has scope only within {} and cant be called out of it, there is no concept of global variable in java
    }
    public static void main(String[] args) {
        // Primitive Data Types
        //byte b = 128; // 8 bits its invalid as it exceeds memory
        byte b = 127;
        short s = 3450;
        long l = 8870511866L;
        char ch = 'B'; //[A-Z][a-z][0-9]
        //char name = "Primitive"; //Invalid as it takes '' only single quotes
        char ch1 = 9;
        char ch2 = '$';
        double d = 54.56D;
        float f = 3.14F;
        char c2 = '\n'; // Escape Char - give you newline
        System.out.println(c2);
        int gg = 98;
        {
            System.out.println(gg); // local variable and has scope only within {} and cant be called out of it, there is no concept of global variable in java
        }
        char c3 = '\u1F6A'; // Unicode
        System.out.println(c3);//  Ὢ :)
        System.out.println(d);
        System.out.println(ch2);
        System.out.println(l);
        System.out.println(b);
        //System.out.println(gg); invalid local variable
    }

}
