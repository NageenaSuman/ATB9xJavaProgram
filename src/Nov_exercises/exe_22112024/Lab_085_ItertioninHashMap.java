package Nov_exercises.exe_22112024;

import java.util.HashMap;
import java.util.Map;


public class Lab_085_ItertioninHashMap {
    public static void main(String[] args) {
        Map <Object, Object> m= new HashMap<>(); //<> declaration is needed as to be used in its for loop
        m.put("Name:", "Nageena");
        m.put("RollNo:", 01);
        m.put("Age:", 30);
        m.put("Phone_NO:", 8870511866l);
        //entryset -- > Key value pair
        for(Map.Entry<Object, Object> item: m.entrySet()){ // different enhanced for loop is used
            System.out.println(item.getKey() + " -> "+ item.getValue());
        }
    }
}
