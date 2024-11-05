package Oct_Exercises.exe_24102024_Tasks;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter any statement or number to find Palindrome or not");
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);

        original = new String(sc.nextLine());

        for (int i=original.length()-1; i>=0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println("Palindrome");
            //radar,level,refer,madam,noon,civic,mom,repaper
            //343,454,12321
        }
        else {
            System.out.println("Not Palindrome");
        }
        System.out.println(reverse);
    }}

