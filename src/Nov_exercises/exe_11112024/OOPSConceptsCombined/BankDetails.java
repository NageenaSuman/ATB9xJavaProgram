package Nov_exercises.exe_11112024.OOPSConceptsCombined;

public class BankDetails {
    //Attributes
    double salary1;
    private String name;
     int salary;
    private long acc_no;
    //Dc is must if you want to inherit it
    BankDetails () {
        System.out.println("DC-Base Class");

    }
    //Constructor
    BankDetails (String name, int salary, long acc_no) {
        this.name = name;
        this.salary = salary;
        this.acc_no = acc_no;

    }
    //method
    public void display(){
        System.out.println("The details of Employee will be displayed");
    }
    // 1 getter 2 setter
    // Concept - 3: Encapsulation using getter setter and private attributes
    public void get_details(boolean isAuth) {
        if (isAuth) {
            System.out.println("The details of Employee are: " );
        }
        else {
            System.out.println("Not Allowed");
        }
    }
    public String set_name(String name) {

        this.name = name;
        return name;


    }
    public long set_accNo(long acc_no, boolean isAuth) {
        if(isAuth) {
        this.acc_no = acc_no; }
        else {
            System.out.println("Not Allowed");
        }
        return acc_no;

    }
    public int set_salary (int salary,boolean isAuth) {
        if(isAuth) {
            this.salary = salary; }
        else {
            System.out.println("Not Allowed");
        }
        return salary;
    }
    //Concept -4 : Polymorphism(method overloading as set_salary is int type in earlier class where as
    //in here it is string
    // method overloading happens in the same class
    public String set_salary (int salary, boolean isAuth, String acc_type) {
        if(isAuth) {
            this.salary = salary; }
        else {
            System.out.println("Not Allowed");
        }
        return acc_type;
    }

}
