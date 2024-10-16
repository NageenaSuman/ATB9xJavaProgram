package Oct_Exercise_mainMethod.exe_14102024;

public class Lab_010_Typecasting {
    public static void main(String[] args){
        //Type casting referred to as converting the variable of one data type into another data type
        // 1.Widening 2.Narrowing

        //Widening  - A lower data type is transformed into a higher one(safe and loseless)
        // Implicit done by JVM automatically , Explicit done by user --> Both are possible
        byte b = 2;
        short s = b; //Implicit by JVM
        int i = (int)b; //Explicit by user
        System.out.println(i);
        int i1 = 10;
        double d = i1;
        System.out.println(d);

        //Narrowing -The process of downsizing a bigger data type into a
        // smaller one is known as narrowing type casting. Casting up or
        // explicit type casting are other names for it. It doesn’t just happen by itself.
        // If we don’t explicitly do that, a compile-time error will occur.
        // Narrowing type casting is unsafe because data loss might happen due to the lower data type’s smaller range of permitted values

        float f = 3.14f;
        //int in = f;//Implicit not possible only explicit can be able to do
        float sal = 864000.78f;
        int in1 = (int)sal; //explicitly being declared
        System.out.println("After Narrowing, the casting result explicitly:" + in1);

    }
}
