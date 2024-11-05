package Oct_Exercises.exe_24102024_Tasks;

import java.util.Scanner;
class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter any statement to reverse it:");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2="";
        System.out.println("The Reversed string is:");
        for (int i=s1.length()-1; i>=0; i--) {
            char ch = s1.charAt(i);
            s2 = s2+ch;

        }
        System.out.printf("%s",s2);

    }
}
