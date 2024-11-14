package Nov_exercises.exe_08112024.Task;

public class Lab_Task_StudentsATB {
    public static void main(String[] args) {
        String[] s = new String[3];
        StudentsATB std = new StudentsATB();
        StudentsATB1 std1 = new StudentsATB1();
        s[0] = std.setPython_batch_name("Nageena", 01, 'A', "PL", 001);
        s[1] = std.setPython_batch_name("Suman", 02, 'B', "PL", 001);
        s[2] = std.setPython_batch_name("PK", 03, 'C', "PL", 001);
        //Method overloaded
//        System.out.println(s[0] = std.setPython_batch_name("Pramod"));
//
//        System.out.println(s[0] = std1.setJava_batch_name("Nageena", 01, 'A', "PL", 001));
//        //Method overloaded
//        System.out.println(s[0] = std1.setJava_batch_name("Pramod"));

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);

        }











    }
}
