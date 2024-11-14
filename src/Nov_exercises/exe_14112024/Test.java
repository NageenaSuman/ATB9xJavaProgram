package Nov_exercises.exe_14112024;

class stats {
   // static int a;
    // Static block
    static
    {
        // Print statement
        System.out.println(
                "Static block can be printed without main method");
    }
}

public class Test {
    public static void main(String[] args) {
        //System.out.println(stats.a = 10);

        stats a2; // only reference creation wont call the static block
    new stats(); // either after the object is created or static variable is called the SIB block gets executed
    }
}