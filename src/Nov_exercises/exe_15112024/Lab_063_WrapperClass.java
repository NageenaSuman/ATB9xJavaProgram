package Nov_exercises.exe_15112024;

public class Lab_063_WrapperClass {
    public static void main(String[] args) {
        Integer a= 10; //Wrapper class ---- will have various attributes
        System.out.println(a.byteValue());
        //Boxing
        int b= 20;
        Integer c = b;
        System.out.println(Integer.MAX_VALUE);
        //Unboxing
        int z = c;
        //System.out.println(z.); you wont get any attributes
        //Conversion

        String s = "10";

        //1. Wrapper class conversion  -  String -> Wrapper(Integer) -> Primitive Int
        Integer ss = Integer.valueOf(s);
        int z1 = ss;
        System.out.println(z1);

        //2. Direct conversion
        int d = Integer.parseInt(s);
        System.out.println(d);


    }
}
