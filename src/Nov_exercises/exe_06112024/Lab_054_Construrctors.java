package Nov_exercises.exe_06112024;

public class Lab_054_Construrctors {
    public static  void main(String[] args) {
        //object 1 with default constructor values as no values has been defined
        // suppose if we dont create default constructor then it will put default values of data types
        Students_DefaultConst s1 = new Students_DefaultConst();
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.phone);
        System.out.println(s1.is_pass);
        //object 2 with values assigned
        Students_DefaultConst s2 = new Students_DefaultConst();
        s2.name = "Rohini";
        s2.age = 20;
        s2.phone = 8870511866l;
        s2.is_pass = false;
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.phone);
        System.out.println(s2.is_pass);

    }

}
