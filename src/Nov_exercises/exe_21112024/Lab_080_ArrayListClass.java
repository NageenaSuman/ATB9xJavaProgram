package Nov_exercises.exe_21112024;
import java.util.List;
import java.util.ArrayList;

public class Lab_080_ArrayListClass {
    public static void main(String[] args) {
        Students s1 = new Students("Nageena", 01);
        Students s2 = new Students("Suman", 02);
        Students s3 = new Students("PK", 03);

        List<Students> myList = new ArrayList<>(); //generic class so will receive any data type
        myList.add(s1);
        myList.add(s2);
        myList.add(s3);
        System.out.println(s1.getNames());

        System.out.println(myList);
        s1.details();


    }






}
class Students {
    private String names;
    private int roll_no;
    //Constructor
    public Students(String names, int roll_no) {
        this.names = names;
        this.roll_no = roll_no;
    }
    //getter setter
    public String getNames (){
        return names;
    }
    public int getRoll_no(){
        return roll_no;
    }
    public String setNames(){
        this.names = names;
        return names;
    }
    public int setRoll_no (){
        this.roll_no = roll_no;
        return roll_no;
    }
    //method

    public void details(){
        System.out.println("Name of student: " + names);
        System.out.println("Roll_No: " + roll_no);
    }

}