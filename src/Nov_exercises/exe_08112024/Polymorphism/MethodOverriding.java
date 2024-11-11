package Nov_exercises.exe_08112024.Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        mathOperations_Father f1 = new mathOperations_Father();
        mathOperations_Kid k1 = new mathOperations_Kid();
        f1.add();
        k1.add();

        //Dynamic Dispatch
        //it is used in method overriding instead of creating a new object for class kid and then calling it
        mathOperations_Father f2 = new mathOperations_Kid();
        f2.add(); //overriden method will be used same operation as k1.add
    }
}
//In case of overriding you need to use the same method as it is without changing its type and
//it can be used only in case of inheritance as yu need to extend the class for which the method
//you want to override

class mathOperations_Father {
    public void add() {
        System.out.println("Am a Father method with no return type");
    }
}

class mathOperations_Kid extends mathOperations_Father {

    //overriding the method - add

    @Override
    public void add() {

        System.out.println("I am a overridden kid method - add");

    }



}