package Nov_exercises.exe_22112024;
import java.util.Map;
import java.util.HashMap;
public class Lab_084_HashMap {
    public static void main(String[] args) {
        Map m = new HashMap(); // Generics

        // Map<String,Object> m1 = new HashMap();
        // Data Type - Fixed
        //unordered
// Ways of declaration
        //Map<String,Integer> map = new HashMap<String,Integer>(); ---> very old method and fixing data type
        //Map<String,Integer> map = new HashMap<>(); --> similar to above
        //Map<String,Integer> map = new HashMap(); --> these are all legacy classes type


        //Map map = new HashMap(); //generic and advanced

        m.put("Name:", "Nageena");
        m.put("RollNo:", 01);
        m.put("Age:", 30);
        m.put("Phone_NO:", 8870511866l);
        System.out.println(m);
        //values can be duplicated but not keys, if keys duplicated then the latest value will be used
        m.put("Name1:", "Nageena");
        m.put("Name:", "Nageena2");
        m.put("Age1:", 30);
        m.put(null, null);
        m.put(null, 123);
        System.out.println(m);

        System.out.println(m.size());
        System.out.println(m.isEmpty());
        System.out.println(m.containsKey("PK"));
        System.out.println(m.keySet());
        System.out.println(m.values());



    }
}
