package Oct_Exercise_mainMethod.exe_09102024;

public class Lab_007_Constant {
    //Declaring the constant using final keyword inside the class so that it can be accessed for all instances of class
    public static final int num_students = 40; //public static is important to be initialised for integer
    public static void main(String[] args) {
        //Declaring the constant using final keyword inside the main method
        final int num_emp = 1000;
        System.out.println("The number of employees are: " + num_emp);
        //num_emp = 9; // Invalid as it can't be changed
        System.out.println("The number of students are: " + num_students);
        // num_students = 67; // Invalid as it can't be changed
        // if we don't use final keyword then we can reassign as it is variable now not constant
        // int num_emp1 = 1000;
        //num_emp1 = 878;
    }
}
