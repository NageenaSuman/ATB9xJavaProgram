package Oct_Exercises.exe_23102024;

public class Lab_034_Functions {
    public static void main(String[] args) {
        // Functions
        // Block of code which we can reuse.

        // 1. Built In - Math.max, min.. String... Time, Date.
        // 2. User Defined.

        // Two component of the functions
        // 1. Define / Declare
        // 2. Call the function

        // we can declare another main function within the main function but arguments should be different

        // calling function1
        greet1();
        // calling function2
        String return_value = greet2();
        System.out.println(return_value);
        // calling function3
        greet3("Nageena", "Suman");
        // calling function4
        int return1 = greet4(3,4);
        System.out.println(return1);





    }
    // 1.FUnction with no return type and no parameter
    static void greet1()  {
        System.out.println("Greeting 1 - Hi");
    }
    // 2. FUnction with return type and no parameter
    static String greet2() {
        System.out.println("Greeting 2 - Hi");
        return "Hi You rule the world";
    }
    // 3. FUnction with no return type but with parameter
    static void greet3(String fn, String ln) {
        System.out.println("Greeting 3 - Hi");
        System.out.println(fn + ln) ;
    }
    // 4. FUnction with return type and parameter
    static int greet4(int a, int b) {
        System.out.println("Greeting 4 - Hi");
        return a+b;
    }

}
