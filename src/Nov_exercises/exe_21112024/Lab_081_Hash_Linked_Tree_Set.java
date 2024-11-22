package Nov_exercises.exe_21112024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_081_Hash_Linked_Tree_Set {
    public static void main(String[] args) {
        //HashSet
        HashSet<Integer> hhs = new HashSet<>(); //fixing to take only integers using <>
        //hhs.add("JK");  ---> not possible
        hhs.add(123);
        hhs.add(98);
        System.out.println(hhs);

        // no order is maintained and no duplicates
        Set hs = new HashSet();
        hs.add("Orange");
        hs.add(123);
        hs.add(9998.6f);
        hs.add(123);
        System.out.println(hs);
        //LinkedHash Set
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates
        Set lhs = new LinkedHashSet();
        lhs.add("Apple");
        lhs.add(12356);
        lhs.add(9.787d);
        lhs.add("Apple");
        lhs.add("apple");
        lhs.add("Apple");
        System.out.println(lhs);
        //TreeHash Set
        //Set<String> ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        Set ths = new TreeSet();
        ths.add("Mango");
        ths.add("mango");
        ths.add("Mango");
        ths.add("Banana");
        //ths.add(123); //ClassCastException as natural sorting cant be done in diff data types
        //ths.add(9998.6f);
        System.out.println(ths);
    }
}
