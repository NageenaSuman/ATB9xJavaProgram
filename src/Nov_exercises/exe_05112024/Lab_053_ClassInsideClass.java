package Nov_exercises.exe_05112024;



public class Lab_053_ClassInsideClass {
    public static void main(String[] args) {
         Cat c1 = new Cat();
         c1.name = "Billo";
         c1.age = 2;

         c1.actions();
         c1.action1(c1.name);



    } }
class Cat {
    String name;
    int age;
    void actions () {
        System.out.println("She always sleeps");
    }
    void action1(String name) {
        System.out.println(name + "She always sleeps");
    }
}

