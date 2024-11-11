package Nov_exercises.exe_08112024.HierarchicalInh;

public class Child2 extends Father{
    Child2 (String home2, int money2) {
        this.home = home2;
        this.money = money2;
        System.out.println("Executing DC of Child2");
    }

    public void ch2_function(){
        System.out.println("My name is Child 2" + home + money);
    }
}
