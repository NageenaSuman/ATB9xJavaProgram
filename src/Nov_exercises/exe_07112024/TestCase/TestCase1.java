package Nov_exercises.exe_07112024.TestCase;

public class TestCase1 extends BaseTest {
    TestCase1(){
        System.out.println("Executing Default constructor of child");
        // this will execute DC of parent too which is called constructor chaining
    }

    public void testcase1exe () {
        print();
        startBrowser();
        readExcelFile();
        closeBrowser();
    }
}
