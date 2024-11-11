package Nov_exercises.exe_11112024.OOPSConceptsCombined;

import java.lang.foreign.StructLayout;

public class Employee1 extends BankDetails {
    //Concept - 1 : Constructor
    Employee1() {
        System.out.println("DC-Employee1");
    }
    //Concept - 2 : Inheriting methods of parent class (Single)
    public void set_Details(boolean isAuth){
        if (isAuth){
        System.out.println(set_name("Rohit"));
        System.out.println(set_accNo(123335656l, true));
        System.out.println(set_salary(30000, true));
    }
    else {
        System.out.println("Not allowed");
    }}




}
