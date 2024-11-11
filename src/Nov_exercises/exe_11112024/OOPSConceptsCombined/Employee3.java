package Nov_exercises.exe_11112024.OOPSConceptsCombined;

public class Employee3 extends BankDetails {


    public void set_Details(){
        System.out.println(set_name("Ramya"));
        System.out.println(set_accNo(123787865l, true));
        System.out.println(set_salary(880000, true, "savings")); //method overloads
    }
}
