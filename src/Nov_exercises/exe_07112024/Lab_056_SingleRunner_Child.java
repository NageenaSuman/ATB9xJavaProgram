package Nov_exercises.exe_07112024;

public class Lab_056_SingleRunner_Child  {
    public static void main(String[] args) {

        Father v1 = new Father();

        v1.print();
        System.out.println("Am inheriting my father( " + v1.father_name + " )" + "amount = " + v1.amount);

    }
}
