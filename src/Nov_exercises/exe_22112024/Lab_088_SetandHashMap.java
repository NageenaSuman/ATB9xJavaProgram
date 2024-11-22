package Nov_exercises.exe_22112024;

import java.util.*;

public class Lab_088_SetandHashMap {
    public static void main(String[] args) {
        Map mp = new HashMap();
        mp.put(1, "Nageena");
        mp.put(2, "Suman");
        mp.put(3, "PK");
        System.out.println(mp);

        Set s = new HashSet();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s);

        Iterator i = s.iterator(); //cant be used for hashmap and hashtable...enum to be used
        while(i.hasNext()){
            System.out.println(i.next());
        }


    }
}
