package Oct_Exercises.exe_25102024;

public class lab_039_EqualsOp {
    public static void main(String[] args) {
        System.out.println("To compare the values use equals operator");
        String s1 = "Nageena"; //SCP
        String s2 = "Nageena"; //SCP
        String s3 = new String("Nageena"); //OA
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3)); // now memory wont be considered intead values will be compared

        String s4 = new String("nageena");
        System.out.println(s1.equals(s4)); // false as values are different

    }
}
