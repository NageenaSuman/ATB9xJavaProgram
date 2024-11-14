package Nov_exercises.exe_14112024;
//Flow:
//1. Class is loaded so SIB too gets loaded once
//2. Goes to main block and executes if any related to static variable
//3. Object gets created
//4. IIB block gets executed based on times of no of objects created
//5.Remaining part of main function
// Note: either after the object is created or static variable is called then only SIB block gets executed

public class Lab_061_StaticandSIB {
    public static void main(String[] args) {

//        //calling static variable without object creation
        System.out.println("Executing the organisation name which is static - " + employee.org_name); // during first load
        //its taking the value which is declared already
        // Creating object and calling the static variable
        employee e = new employee("Nageena", 8870511866l, 2500, "TCS");
        employee e1 = new employee("Suman", 8870511866l, 28700, "CSG");
        // static org_name changed and reflects to last created object pointing to it
        System.out.println(e.org_name) ;
        System.out.println("The details of employee are: " + e.name + "," + e.phone_no + "," + e.salary + "," + employee.org_name);

    }
}



//Using static variable
class employee {
    String name; // Non static variable // Instance Variable
    long phone_no;
    int salary;
    static String org_name = "CTS"; // Static Variable - common to all

    //Constructor
    employee (String name, long phone_no, int salary, String org_name){
        this.name = name;
        this.phone_no = phone_no;
        this.salary = salary;
        this.org_name = org_name;

    }

    //Instance Initialisation Block
    {
        System.out.println("IIB");
        System.out.println("Here you can write a code what you want to do when Object is created");
        //System.out.println("Eg:Read a MySQL db()");
    }
    // Static Initialisation Block
    static {
        System.out.println("SIB");
        System.out.println("Loaded Once, When Class is Loaded.");
        //System.out.println("Eg:Read the excel file");
    }


}