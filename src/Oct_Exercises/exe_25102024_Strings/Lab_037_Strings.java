package Oct_Exercises.exe_25102024_Strings;

public class Lab_037_Strings {
    public static void main(String[] args) {
        System.out.println("Strings Declaration");
        // 1. Normal declaration in SCP(String Constant pool) - Immutable
        // where the values will be compared before assigning the string to new variable
        // as it wont create a new if values are same

        String name = "Nageena";
        String name1 = "Nageena";
        String na= "nageena";

        // no of strings = 2 as name and name1 are having same values
        System.out.println(name == name1); // here both are in SCP so the value is true
        System.out.println(name);
        // ==  This is checking the ref locations
        // even if values are same in OA but memories are diff so false will be generated
        String s1 = new String("Nageena");
        String s2 = new String("Nageena");
        String s3 = new String("Nageena");
        // no of strings = 3 as the new object will create new memory even if the value is same
        System.out.println(s1 == s2);// here value wont be compared as both are in diff memories
        String name2 = s1; //here making s1 now point to scp from object area to scp with name2 being created in scp
        System.out.println(name2 == s1) ;// so if we compare s1 and name2 the result is true as both are having save values in scp


        System.out.println(name2 == s2) ; // false as s2 is in OA
    }
}
