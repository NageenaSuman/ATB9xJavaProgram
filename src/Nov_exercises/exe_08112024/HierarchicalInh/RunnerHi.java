package Nov_exercises.exe_08112024.HierarchicalInh;

public class RunnerHi {
    public static void main(String[] args) {
        Child1 c1 = new Child1("2BHK", 20000);
        Child2 c2 = new Child2(" - 1BHK - ", 300000);
        Child3 c3 = new Child3();
        //Executing CH1 and Father function
        c1.father_function();
        c1.ch1_function();
        c2.ch2_function();
        c3.ch3_function();

    }
}
