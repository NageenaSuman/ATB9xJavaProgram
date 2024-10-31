package Oct_Exercises.exe_28102024;

public class Lab_041_BasicStringFunctions {
    public static void main(String[] args) {
        System.out.println("Printing out the basic String functions");
        String s1 = "Nageena Suman";
        System.out.println(s1.length()); // counting will begin from 1 not 0
        System.out.println(s1.indexOf("N")); // here indexing happens as usual from 0
        System.out.println(s1.lastIndexOf("a")); //returns the index of last occurance of a
        System.out.println(s1.substring(5,10)); // returns the character present from those start to char before the end index but not the exact end index
        System.out.println(s1.substring(7)); // returns the character from that particular index till end

        String s2 = new String (" My name is Suman, and am a strong lady, want to know more?...   ");

        System.out.println(s2.split(",")[1]); // splits the line based on delimiter
        System.out.println(s1.charAt(8)); //returns char at that particular index
        System.out.println(s2.trim()); // removes the white space leading and trailing
        System.out.println(s1.replace("n", "m"));
        System.out.println(s2.replaceAll(",","-"));
        System.out.println(s2.contains("r"));
        System.out.println(s2.startsWith("Na"));
        System.out.println(s2.endsWith("?"));



    }
}
