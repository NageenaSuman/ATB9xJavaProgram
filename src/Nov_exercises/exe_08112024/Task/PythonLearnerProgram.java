package Nov_exercises.exe_08112024.Task;

public class PythonLearnerProgram extends BaseClass {
    //PythonLearnerProgram () {}

    String setPython_batch_name(String name, int id, char grade, String batch_name, int b_no ){
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.batch_name = batch_name;
        this.b_no = b_no;
        display();
        return("Python Batch details of the above student are: " + '\n' +
                "Batch Name - "+ batch_name + " Batch ID - " + b_no);

    }



}
