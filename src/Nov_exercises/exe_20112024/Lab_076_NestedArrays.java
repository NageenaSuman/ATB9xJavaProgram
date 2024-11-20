package Nov_exercises.exe_20112024;

import java.util.ArrayList;
import java.util.List;

public class Lab_076_NestedArrays {
    public static void main(String[] args) {
        List l1 = List.of("Nageena",123,453);
        System.out.println(l1);
        ArrayList l2 = new ArrayList();
        l2.add("PK");
        l2.add(123);
        l2.add(6767);
        System.out.println(l2);
        ArrayList l3 = new ArrayList();
        l3.add("Suman");
        l3.add("Eesa");
        System.out.println(l3);
        ArrayList all_list = new ArrayList();
        all_list.add(l1);
        all_list.add(l2);
        all_list.add(l3);
        System.out.println(all_list);
    }
}
