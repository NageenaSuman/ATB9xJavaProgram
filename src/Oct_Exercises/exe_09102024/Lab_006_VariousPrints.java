package Oct_Exercises.exe_09102024;

public class Lab_006_VariousPrints {
    public static void main(String[] args) {
        //Difference Between prints
        //println(executes and terminates by creating new line)
        //print(prints without creating new line)
        //printf(concatenates with the output string to print along with the variable value)
        for (int a=1; a <= 10; a++) {
            int table  = a * 10;
            System.out.print("\n");
            System.out.println("The value of a is " + a);
            System.out.printf("The table is: " + "%d * %d = %d", a , 10, table); //%d for int,byte,long,short, %b for boolean,%x - hex, %f for floating and double, %s for short
        }
    }
}
