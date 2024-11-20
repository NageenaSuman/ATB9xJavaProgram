package Nov_exercises.exe_20112024;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab_071_List_ArrayList_LinkedList {
    public static void main(String[] args) {
        // normal list creation using static function .of
        List l1 = List.of("Car", "Bus", "Auto", 123, true, 0.8887f);
        //l1.add("PK");  --> UnsupportedOperationException
        //ArrayList creation == Arrays Format - Continuous
        ArrayList l2 = new ArrayList();
        l2.add("Orange");
        l2.add("Banana");
        l2.add("Apple");
        //LinkedList creation == Doubly Linked List.
        LinkedList l3 = new LinkedList();
        l3.add("Onion");
        l3.add("Broccoli");
        l3.add("Brinjal");

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

    }
}
