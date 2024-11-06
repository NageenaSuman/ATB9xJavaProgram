package Nov_exercises.exe_05112024;

public class DogClass {
    //Attribute

    String breedname, nameOfDog, home_add;
    int age;

    //Behaviour
    void barks() {
        System.out.println("The breedname is:" + breedname);
        System.out.println("The Dog name is:" + nameOfDog);
        System.out.println("The address is:" + home_add);
        System.out.println("The age of" + nameOfDog + " is:" + age);
    }

    void eats(String food) {
        System.out.println("He eats biscuit bones");
    }

    int walks() {
        return 2;
    }

    int runs(int a) {
        System.out.println("He runs " + a + " miles per day");
        return a;
    }
}