package Nov_exercises.exe_07112024.MultilevelInheritance;

public class GrandFather {
    //Attributes
    String name;
    int age;
    double Salary;
    //DC
    GrandFather() {
        System.out.println("DC - GrandFather");
        name = "XXX";
        age = 00;
        Salary = 34000;
    }
    public void details() {
        System.out.println("The details");
        System.out.println(name + "-" + age + "-" + Salary);
    }
}
