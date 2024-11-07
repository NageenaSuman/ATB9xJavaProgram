package Nov_exercises.exe_06112024;
import java.util.Scanner;
public class Lab_055_ConstructorPara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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


        System.out.println("Enter the book name:");
        String book_name1 = sc.nextLine(); //need to create variables as we need to pass this as parameters
        // to user entered input constructor
        System.out.println("Enter the author name:");
        String author = sc.nextLine();
        System.out.println("Enter the release year:");
        int release_year = sc.nextInt();


        book_re b4 = new book_re(book_name1,author,release_year);
        b4.details();


    }


}
    class book_re {
        // Attributes of a class
        String name, auth;
        int year;


        //Behaviours of a class
        void display() {
            System.out.println("Book Details -> " + this.name + " - "+ this.year);
        }
        void details() {
            System.out.println("Executing User details entered for book");
            System.out.println(this.name + "-" + this.year + "-" + this.auth);
        }


        //Parameterised constructor - 1
        book_re (String book_name, int year_of_release){
        System.out.println("The Book details by executing Parameterised constructor");
        this.name = book_name; //generalising it using this keyword
        this.year = year_of_release; }

        //Constructor overloading - Parametrised constructor - 2
        book_re (String book_name) {
        System.out.println("Executing constructor overloading");
        this.name = book_name; }

        //user input constructor
        book_re(String book_name1, String author, int release_year){

            this.name = book_name1;  //if you dont give this, here it will print default values
            this.year = release_year;
            this.auth = author;



    }
}



