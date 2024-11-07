package Nov_exercises.exe_07112024;

public class Lab_056_SingleRunner_ChildAnotherEg extends Son {
    public static void main(String[] args) {

        Son v1 = new Son();
        v1.display(); //accessing son directly
        v1.print(); // accessing father->son->
         //
        System.out.println("Am inheriting my father( " + v1.father_name + " )" + "amount = " + v1.amount);

        Father f1 = new Father();
        // f1.display()  ---- > not possible as father class is not extending son

    }
}
