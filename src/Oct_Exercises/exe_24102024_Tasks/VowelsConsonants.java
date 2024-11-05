package Oct_Exercises.exe_24102024_Tasks;
import java.util.Scanner;
public class VowelsConsonants {
    public static void main(String[] args) {
    System.out.println("Enter any statement to find vowels and consonants in it:");

    Scanner sc = new Scanner(System.in);

    String s1 = new String(sc.nextLine()).toLowerCase();
    int vo = 0;
    int co = 0;
    for (int i=0; i<s1.length(); i++) {

        if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u' ) {
            vo++;

        }

        else {
            co ++;
        }


    }
        System.out.println("The number of consonants = :" + co);
        System.out.println("The number of vowels = :" + vo);
    }
}



