package Oct_Exercise_mainMethod.exe_15102024;

public class Lab_012_PrePostInc {
    public static void main(String[] args) {
        //Pre-increment  - value is incremented first and then stored in the result.
        //Post-increment - Print first and then increase
        int a = 10;
        //Pre increment section
        System.out.println(a); //10
        System.out.println(++a); //11

        // Now the value of a has been changed
        System.out.println(a); //11

        //post increment section
        System.out.println(a++); //11
        System.out.println(a); //12
        //final expression
        a = 10;
        int result =++a + a++ + a++; // 11 + (now a = 11) and after a++ which is now still 11 as the result is stored in +
        // now the value of a is 12 which will be same for a++ as result will be stored in and considered in next step
        System.out.println("The final result for expression - [++a + a++ + a++] is: " + result);
        System.out.println("After final expression the value of a is:" + a);

    }
}
