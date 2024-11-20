package Nov_exercises.exe_20112024;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class Lab_073_IterationinArrayList {
    public static void main(String[] args) {
        List l1 = new ArrayList(); //dynamic dispatch
        l1.add("Nageena");
        l1.add("Suman");
        l1.add("PK");
        l1.add(123);
        l1.add(false);
        l1.add(78.8d);
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());

        //Traditional for loop
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));

        }
        // for - each / enhanced for loop // limited only to list but cant be used for set and queue
        for (Object obj:l1){
            System.out.println(obj);
        }

        // Iterator --- can be used across collections
        Iterator it = l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

//        int[] numbers = {3, 9, 5, -5};
//
//        // for-each loop to print array elements
//        for (int number : numbers) {
//            System.out.println(number);
//        }

    }
}
