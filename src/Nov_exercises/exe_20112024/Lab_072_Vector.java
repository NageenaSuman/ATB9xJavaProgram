package Nov_exercises.exe_20112024;

import java.util.Vector;

public class Lab_072_Vector {
    public static void main(String[] args) {
        //Vector is a legacy class and has synchronization which leads to thread security

        Vector v = new Vector();
        v.add("Nageena");
        v.add("Suman");
        v.add("PK");
        v.add(123);
        v.add(false);
        v.add(78.8d);
        System.out.println(v);
        System.out.println(v.contains(123));
        System.out.println(v.indexOf("PK"));
        System.out.println(v.lastElement());
        v.remove("PK");
        System.out.println(v);



    }
}
