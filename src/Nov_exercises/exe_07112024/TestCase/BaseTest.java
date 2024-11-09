package Nov_exercises.exe_07112024.TestCase;

public class BaseTest {
    //attributes
    String testcase_name;
    int testcase_no;
    //constructor
    BaseTest () {
        System.out.println("Executing Default constructor of parent");
        testcase_name = "Selenium";
        testcase_no = 01;
    }
    //Behaviour
    public void print(){
        System.out.println("Printing test case details:");
        System.out.println(testcase_name + "-" + testcase_no);
    }
    public void startBrowser() {
        System.out.println("Staring Browser!!");
    }

    public void closeBrowser() {
        System.out.println("Closing Browser!!");
    }

    public void readExcelFile(){
        System.out.println("Reading File");
    }

}
