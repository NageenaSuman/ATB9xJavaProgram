package Nov_exercises.exe_19112024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab_070_ArrayList {
    public static void main(String[] args) {
        Collection ch1 = new ArrayList();//Dynamic Dispatch

        List l1 = new ArrayList(); //Dynamic Dispatch
        ArrayList l2 = new ArrayList();

        l2.add("Nageena");
        l2.add(1, "Suman");
        l2.add(2,"Suman");
        l2.add(3,"PK");
        l2.add(true);
        l2.add(0.666f);
        l2.add(1);
        System.out.println(l2);

        System.out.println(l1.size());
        System.out.println(l2.isEmpty());
        System.out.println(l2.contains(1));
        System.out.println(l2.lastIndexOf("Suman"));
        System.out.println(l2.indexOf(0.666f));
        System.out.println(l2.indexOf(1));
        System.out.println(l2.getLast());
        l2.remove(0.666f);
        System.out.println(l2);


    }
}
