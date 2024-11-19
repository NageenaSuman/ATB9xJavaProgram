package Nov_exercises.exe_19112024;

public class Lab_069_GenericEg {
    public static void main(String[] args) {

        System.out.println(add(2,3)); //normal static method call which takes only ìnteger

        System.out.println(add1(2, "PK")); //can use any data type to return value
    }
     public static int add(int a, int b) {
        return a + b;
    }
    public static <T> T add1(T a, T b){ //<T> - anydata type T - return type, using return
        //return a+b;// cant use as boolean data type would also be there and we cant add it
        return a ;


    }




}
