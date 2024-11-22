package Nov_exercises.exe_21112024;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Lab_082_Enumeration {
    public static void main(String[] args) {
        // Iterator - For legacy Class I can't use
        // Enumeration applicable only to vector and set

        Vector v = new Vector();
        v.add("Nageena");
        v.add("Suman");
        v.add("PK");
        v.add(123);
        v.add(false);
        v.add(78.8d);

        Enumeration enum2 = v.elements();
        while(enum2.hasMoreElements()){

            System.out.println(enum2.nextElement());
        }

    }
}
