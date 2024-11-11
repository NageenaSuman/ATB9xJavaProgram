package Nov_exercises.exe_08112024.HierarchicalInh;

public class Child1 extends Father{
    Child1 (String home1, int money1) {
        this.home = home1;
        this.money = money1; //if you dont use this it will not use the values you give it will print default values
        System.out.println("Executing DC of Child1");
    }

    public void ch1_function(){
        System.out.println("My name is Child 1 - " + home + "," + money);
    }
}
