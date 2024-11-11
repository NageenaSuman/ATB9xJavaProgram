package Nov_exercises.exe_08112024.Polymorphism;

public class MethodOverLoading {
    public static void main(String[] args) {
        mathOperations ma = new mathOperations();
        ma.add(); // calling the method as it is
        System.out.println(ma.add(232322,565656, 87)); //calling the overloaded method
        System.out.println(ma.add("Nageena" ," Suman")); //calling the overloaded method


    } }




class mathOperations { //Declare the class without access modifier as it a separate class, if you
    //create it under main class then the same access modifier with static means public static class should be used

    public void add() {
        System.out.println("Am a method with no return type");
    }
    //overloading the method - add
    public int add(int a, int b) {
        System.out.println("I have over loaded(1) the method - add by making it as return type");
        return a + b;
    }
    public double add(double a,double b,int x){
        System.out.println("I have over loaded(2) the method");
        return a + b + x;
    }
    public String add(String x, String y) {
        System.out.println("I have over loaded(3) the method");
        return x + y;
    }


}