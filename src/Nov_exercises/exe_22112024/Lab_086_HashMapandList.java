package Nov_exercises.exe_22112024;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Lab_086_HashMapandList {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("Name:", "Nageena");
        m1.put("RollNo:", 01);
        m1.put("Age:", 30);
        m1.put("Phone_NO:", 8870511866l);
        System.out.println(m1);

        HashMap m2 = new HashMap();
        m2.put("Name:", "Suman");
        m2.put("RollNo:", 02);
        m2.put("Age:", 31);
        m2.put("Phone_NO:", 8870511866l);
        System.out.println(m2);

        List mylist = new ArrayList();
        mylist.add(m1);
        mylist.add(m2);
        System.out.println("The list of students in array:");
        System.out.println(mylist);

    }
}
