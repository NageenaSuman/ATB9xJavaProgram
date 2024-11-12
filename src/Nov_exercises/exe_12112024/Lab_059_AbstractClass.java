package Nov_exercises.exe_12112024;

public class Lab_059_AbstractClass {
    public static void main(String[] args) {
        child ch = new child();
        System.out.println(ch.Dog("Rocky"));
        System.out.println(ch.Cat("Rosy"));
        ch.display();
    }
}



abstract class Animal {
    String dogName, catName;
    Animal(){
        System.out.println("AM DC of PARENT CLASS");
    }
    abstract String Dog(String dogName); // {} not used as it wont have body
    abstract String Cat(String catName);

}

class child extends Animal {
    child(){
        System.out.println("am a DC of child inheriting parent class - Animal");

    }
    child(String dogName, String catName) {
        this.catName = catName;
        this.dogName = dogName;
    }
    @Override
    public String Cat(String catName) {

        return "Cat Meows - " + catName;
    }

    @Override
    public String Dog(String dogName) {
        return "Dog Barks - " + dogName;
    }
    void display(){
        System.out.println("Running complete method of Child");
        System.out.println(Dog("Tudu"));
        System.out.println(Cat("Rosy Ma"));
    }

}
