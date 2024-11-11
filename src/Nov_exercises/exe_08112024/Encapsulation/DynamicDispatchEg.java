package Nov_exercises.exe_08112024.Encapsulation;
//Dynamic dispatch, also known as runtime polymorphism, is a mechanism in Java that determines
// which method implementation to invoke at runtime based on the actual type of the object,
// rather than the declared type. This allows for more flexible and extensible code.

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class DynamicDispatchEg {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.makeSound(); // Outputs: Dog barks

        myAnimal = new Cat(); // Upcasting
        myAnimal.makeSound(); // Outputs: Cat meows
    }
}
