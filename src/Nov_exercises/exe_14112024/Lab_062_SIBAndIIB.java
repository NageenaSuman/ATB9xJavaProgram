package Nov_exercises.exe_14112024;

public class Lab_062_SIBAndIIB {
    public static void main(String[] args) {

        System.out.println(Students.ins_name); // during this phase SIB gets called as we are calling static variable
        Students s1 = new Students("Rohit", 21, "bvc" );
        s1.display(); //calling normal method
        s1.display1(); //calling static method
        s1.getAge();
        s1.setAge(20); //changing values
        s1.getName();
        s1.setName("Mia");
        s1.setIns_name("bvc");//we can also change the static variable using setter method
        s1.display(); // calling normal method
        System.out.println(Students.ins_name); // changed value of static variable
    }
}


class Students {
    //Attributes
    private String name;
    private int age;
    static String ins_name = "ATB";
    //constructor
    Students (String name, int age, String ins_name){
        this.name = name;
        this.age = age;

    }
    //IIB Block
    {
        System.out.println("Executing IIB");
    }
    //SIB Block
    static {
        System.out.println("The institute name is: " + ins_name);
    }
    //getter and setter for private attributes

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //method for changing static variable
    public String setIns_name(String ins_name){
        this.ins_name = ins_name;
       return ins_name;
    }
    //normal or non-static method

    public void display(){
        System.out.println("The students details are:" + '\n' + name + '\n'+ age);
    }

    //static Methods
    static void display1(){
        System.out.println("The students of " + ins_name); // only static variables can be called in static method
    }


}