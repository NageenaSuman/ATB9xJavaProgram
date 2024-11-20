package Nov_exercises.exe_20112024;

import java.util.Collections;
import java.util.Vector;

public class Lab_075_VectorReverseOrder {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(65);
        v.add(68);
        v.add(69);
        v.add(60);
        v.add(65);
        System.out.println(v);

        Collections.sort(v); // sorting first
        System.out.println("Sorted List:" + v);
        Collections.reverse(v);
        System.out.println("Reversed Order/Array:" + v);




    }
}
