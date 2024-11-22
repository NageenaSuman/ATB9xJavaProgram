package Nov_exercises.exe_21112024;

import java.util.LinkedList;
import java.util.List;

public class Lab_077_LinkedList {
    public static void main(String[] args) {
        List ll = new LinkedList();

        ll.add("Nageena");
        ll.add("Suman");
        ll.add("pk");
        System.out.println(ll);
        ll.add(1,"HAhaha");
        System.out.println(ll);
        System.out.println(ll.isEmpty());

    }
}
