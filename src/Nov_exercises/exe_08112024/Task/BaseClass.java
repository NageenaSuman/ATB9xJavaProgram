package Nov_exercises.exe_08112024.Task;

public class BaseClass {
    //Attributes
    String name;
    int id;
    char grade;
    String batch_name;
    int b_no;
    //DC
    BaseClass(){
        //System.out.println("Executing DC of Base class");
    }
    //Constructor
    BaseClass (String name, int id, char grade){

        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    //method
    void display(){
        System.out.println("The details of students are: " + '\n' +
                "Name - "+ name +  '\n' +"ID - " + id + '\n' + "Grade - " + grade);


    }




}
