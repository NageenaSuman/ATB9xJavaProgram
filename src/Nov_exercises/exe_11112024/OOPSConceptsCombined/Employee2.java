package Nov_exercises.exe_11112024.OOPSConceptsCombined;

public class Employee2 extends BankDetails {

        Employee2 () {
            System.out.println("DC-Employee2");
        }


        public double set_salary(double salary1, boolean isAuth){

            if(isAuth) {
                this.salary1 = salary1; }
            else {
                System.out.println("Not Allowed");
            }
            return salary1;

        }
        public void set_Details(){
            System.out.println(set_name("Viji"));
            System.out.println(set_accNo(17878656l, true));
            System.out.println(set_salary(40000, true));
        }


    }

