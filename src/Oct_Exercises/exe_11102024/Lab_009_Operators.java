package Oct_Exercises.exe_11102024;

public class Lab_009_Operators {
    public static void main(String[] args){
       //1.Arithmetic Operators are used to perform simple arithmetic operations on primitive and non-primitive data types
        int a = 1, b= 2;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        //2.Unary Operators are used to increment, decrement, or negate a value
        //It performs an automatic conversion to int when the type of its operand is the byte, char, or short.
        // This is called unary numeric promotion.
        byte b1 = 2;
        //Post increment - value is used to increment the result
        System.out.println("Increment = " + (b1++) + " Result = " + b1);
        //Pre-increment - first the increment of 1 happens and then gets added to value
        b1 = 2;
        System.out.println("Increment = " + (++b1) + " Result = " + b1);
        b1 = 2;
        //Post decrement - value is used to increment the result
        System.out.println("decrement = " + (b1--) + " Result = " + b1);
        b1 = 2;
        //Pre-decrement - first the increment of 1 happens and then gets added to value
        System.out.println("decrement = " + (--b1) + " Result = " + b1);
        System.out.println(b1 != 6);

        //3.Assignment Operator = [In many cases, the assignment operator can be combined with other operators to build a
        // shorter version of the statement called a Compound Statement].
        int f = 7;
        System.out.println("f += 3: " + (f += 3)); //now f value is 10
        System.out.println("f -= 2: " + (f -= 2)); //now f value is 8
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 3: " + (f /= 3));
        System.out.println("f %= 2: " + (f %= 2));

        //4.Relational Operators - are extensively used in looping statements as well as conditional if-else statements.
        int e = 10;
        int g = 3;
        int h = 5;

        System.out.println("e > g: " + (e > g));
        System.out.println("e < g: " + (e < g));
        System.out.println("e >= g: " + (e >= g));
        System.out.println("e <= g: " + (e <= g));
        System.out.println("e == h: " + (e == h));
        System.out.println("e != h: " + (e != h));

        //5. Logical Operators - are used to perform “logical AND” and “logical OR” operations
        //AND --> returns true when both conditions are true
        //OR --> returns true if at least one condition is true
        // NOT --> returns true when a condition is false and vice-versa
        byte by=1;
        short sh = 3;
        boolean name = true;
        boolean name1 = false;
        System.out.println("Logical NOT Operator:" + (by!=sh));
        System.out.println("AND Operator: " + (name && name1));
        System.out.println("OR Operator: " + (name || name1));

        //6. Ternary Operators - shorthand version of the if-else statement
        // if the condition evaluates to true, then execute the statements after the ‘?’ else execute the statements after the ‘:’
        int n1 = 5, n2= 10, n3= 4;
        int result = ((n1>n2)?(n1>n3)?n1:n3:(n2>n3)?n2:n3);
        System.out.println("Max of three numbers:" + result);

        //6. Bitwise Operator - are used to performing the manipulation of individual bits of a number which can be useful
        // for optimizing performance in certain cases
        // Initial values
        int a1 = 5;
        int b11 = 7;

        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a1&b11 = " + (a1 & b11));

        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a1|b11 = " + (a1 | b11));

        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a1^b11 = " + (a1 ^ b11));

        // bitwise not
        // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
        // will give 2's complement (32 bit) of 5 = -6
        System.out.println("~a1 = " + ~a1);


    }
}
