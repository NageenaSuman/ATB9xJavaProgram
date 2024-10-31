package Oct_Exercises.exe_28102024;

public class Lab_042_StringBufferandBuilder {
    public static void main(String[] args) {
        // Differences between concatenation and append
        //concatenation - String concatenation forms a new String that is the combination of multiple strings.
        // 1. concat() method - concatenates the specified string to the end of current string.

        String char_ = "Chennai";
        System.out.println(char_.concat(" is best place"));

        // 2. Using + operator
        System.out.println(30 + 30 + char_ + 40 + 40); //After a string literal, all the + will be treated as string concatenation operator

        //The append() method accepts arguments of different types like Objects, StringBuilder,
        // int, char, CharSequence, boolean, float, double. StringBuilder is the most popular
        // and fastet way to concatenate strings in Java. It is mutable class which means
        // values stored in StringBuilder objects can be updated or changed.

        //but we prefer StringBuffer as it is thread safe

        StringBuffer str = new StringBuffer("TamilNadu");
        System.out.println(str.append(" is my state")); //append adds the element at the last in the list
        System.out.println(str.reverse());

        StringBuilder _1 = new StringBuilder("Hello World!");
        System.out.println(_1.append(",am here"));

        StringBuilder _2 = new StringBuilder("Hello World!");
        _2.append(",I rule");
        System.out.println(_2);
        //Java compiler internally calls toString() method, overriding this method will return the specified values
        System.out.println(_2.toString());



    }
}
