package Nov_exercises.exe_22112024;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class Lab_087_HashTable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("Name", "Nageena");
        ht.put("RollNo", 01);
        ht.put("Age", 30);
        ht.put("Phone_NO", 8870511866l);
        // does not accept null values or null keys
        //ht.put(null, 123); //NullPointerException

        System.out.println(ht);

        //Enumeration ennum = ht.elements(); //this will provide only values but not keys
        Enumeration ennum2 = ht.keys(); // so declare like this
        while (ennum2.hasMoreElements()) {
            Object keys = ennum2.nextElement(); // this will give values
            System.out.println("Key: " + keys);
            System.out.println("value: " +  ht.get(keys));//prints only values
    }
}}
