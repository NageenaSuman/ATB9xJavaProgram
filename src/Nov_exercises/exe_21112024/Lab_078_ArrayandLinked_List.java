package Nov_exercises.exe_21112024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab_078_ArrayandLinked_List {
    public static void main(String[] args) {
        List ll = new LinkedList();
        List al = new ArrayList();

        ll.add("Nageena");
        ll.add("Suman");
        ll.add("pk");
        System.out.println(ll);
        al.add("Nageena");
        al.add("Suman");
        al.add("pk");
        System.out.println(al);
        System.out.println(al.equals(ll)); // compares the  two lists elements
        al.add(0, "allah");
        System.out.println(al.equals(ll));

        //Iteration

        for (Object o:al){
            System.out.println(o);
        }
        Iterator il = ll.iterator();
        while(il.hasNext()){
            System.out.println(il.next());
        }

    }
}
