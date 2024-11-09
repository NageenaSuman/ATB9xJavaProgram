package Nov_exercises.exe_07112024.MultilevelInheritance;

public class Father extends GrandFather{

    //DC
    Father() {
        System.out.println("DC - Father");
        name = "YYY";
        age = 01;
        Salary = 35000;

    }
    public void details1() {
        System.out.println("The details of employee1:");
        System.out.println(name + "-" +age + "-" + Salary);
    }
}
