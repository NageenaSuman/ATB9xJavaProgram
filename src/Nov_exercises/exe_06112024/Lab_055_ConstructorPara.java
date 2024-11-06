package Nov_exercises.exe_06112024;

public class Lab_055_ConstructorPara {
    public static void main(String[] args) {
    book_re b1 = new book_re("Mindset", 2002);
    System.out.println(b1.name);
    System.out.println(b1.year);
    b1.display();

    book_re b2 = new book_re("Consious Mind", 2013);
    System.out.println(b2.name);
    System.out.println(b2.year);
    b2.display();

    book_re b3 = new book_re("Consious Mind 2");
    System.out.println(b3.name);


    //constructor overloading calling

    }


}
class book_re {
    String name;
    int year;
    //Parameterised constructor
    book_re (String book_name, int year_of_release){
        System.out.println("The Book details by executing Parameterised constructor");
        this.name = book_name; //generalising it using this keyword
        this.year = year_of_release;



    }
    //Constructor overloading
    book_re (String book_name) {
        System.out.println("Executing constructor overloading");
        this.name = book_name;
    }
    void display() {
        System.out.println("Book Details -> " + this.name + " - "+ this.year);
    }
}



