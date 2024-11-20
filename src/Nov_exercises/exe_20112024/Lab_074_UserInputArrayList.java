package Nov_exercises.exe_20112024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lab_074_UserInputArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Fixing the array to get only string using generic
        ArrayList<String> my_list_names = new ArrayList();
        ArrayList<Integer> my_list_ages = new ArrayList();

        //Getting input based on control
        String inputControl = "Y";
        while (inputControl.equalsIgnoreCase("y")) {
            System.out.println("Enter name:");
            my_list_names.add(sc.nextLine());
            System.out.println("Enter age:");
            my_list_ages.add(sc.nextInt());
            sc.nextLine();
            System.out.println("Do you want to insert another record?(Y/N):");
            inputControl = sc.nextLine();
        }
        System.out.println("Names" + my_list_names);
        System.out.println("Ages" + my_list_ages);
        //Displaying collected data
        for (Object ui : my_list_names) {

            System.out.println(ui);
        }
        Iterator it = my_list_ages.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}