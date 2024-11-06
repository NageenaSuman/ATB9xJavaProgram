package Nov_exercises.exe_05112024;

public class Lab_052_OOPS_Runner {
    public static void main(String[] args) {
        DogClass d1 = new DogClass(); //object - 1 created
        // Attributes of object 1
        d1.breedname = "ChowChow";
        d1.age = 2;
        d1.home_add = "Vellore";
        d1.nameOfDog = "ChingChing";
        // Calling methods/behaviours of object 1
        d1.barks();
        d1.eats("bones");
        d1.runs(12);
        System.out.println("=======================");

        DogClass d2 = new DogClass(); //object - 2 created

        // Attributes of object 2
        d2.breedname = "GoldenRetriever";
        d2.age = 5;
        d2.home_add = "Banglore";
        d2.nameOfDog = "Chippu";
        // Calling methods/behaviours of object 1
        d2.barks();
        d2.eats("bones");
        d2.runs(11);
        System.out.println("+++++++++++++++++++++++");

        DogClass d3 = new DogClass(); //object - 3 created
        // Attributes of object 2
        d3.breedname = "Pug";
        d3.age = 3;
        d3.home_add = "Chennai";
        d3.nameOfDog = "Rosey";
        // Calling methods/behaviours of object 1
        d3.barks();
        d3.eats("bones");
        d3.runs(5);
        System.out.println("************************");

        // sample calling as it is
        System.out.println(d1); // this will just print the object address as we are calling object reference
        System.out.println(d1.breedname); //this will print real value
    }

}
