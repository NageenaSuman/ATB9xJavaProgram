package Nov_exercises.exe_12112024;

public class Lab_060_Interface_MultipleInh_Class {
    public static void main(String[] args) {
    school s1 = new school();
    s1.function1();
    s1.function2();

    s1.function_same();
    System.out.println(s1.function7("Nageena"));
    }
}


class school implements teachers,students { //multiple inheritance

    // overriding the teachers class
    @Override
    public void function1(){
        System.out.println("Executing function 1");
    }
    @Override
    public void function2(){
        System.out.println("Executing function 2");
    }
    @Override
    public void function3(){
        System.out.println("Executing function 3");
    }

    @Override
    public void function_same() {
        System.out.println("Executing same function");
    }

    @Override
    public void function4() {
        System.out.println("Executing function 4");
    }

    @Override
    public void function5() {
        System.out.println("Executing function 5");
    }

    @Override
    public void function6() {
        System.out.println("Executing function 6");
    }
    //overriding the students class

}



interface teachers {
    //teachers(){} --- constructors are not allowed in interface
//    void function1(){
//
//    }  ------- complete function cannot be used or can only declare not define
//    but can be used with default/static keyword - default only works

    abstract public void function1(); //public/abstract is default in nature and keyword no need to use
    void function2(); //by default it is private, so if you overriding it change its type in inheriting class
    void function3();
    void function_same();
}

interface students {
    void function_same(); // if same function name only one will be used
    void function4();
    void function5();
    void function6();
    default String function7(String std_name){
        System.out.println("My own complete function");
        return "Student name is " + std_name;
    }

}

