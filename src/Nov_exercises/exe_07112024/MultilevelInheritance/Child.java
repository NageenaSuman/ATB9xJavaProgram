package Nov_exercises.exe_07112024.MultilevelInheritance;

public class Child extends Father {

    //DC
    Child() {
        System.out.println("DC - Child");
        name = "ZZZ";
        age = 03;
        Salary = 36000;
    }
    public void details2() {

        System.out.println("The details of employee2:");
        System.out.println(name + "-" + age + "-" + Salary);
    }
}
