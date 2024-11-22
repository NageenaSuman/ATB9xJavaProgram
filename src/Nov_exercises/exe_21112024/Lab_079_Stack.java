package Nov_exercises.exe_21112024;

import java.util.List;
import java.util.Stack;

public class Lab_079_Stack {
    public static void main(String[] args) {
        Stack s = new Stack(); //last in first out
        s.add("Nageena");
        s.add("Suman");
        s.add("pk");
        System.out.println(s);
        //push and pop
        s.push("allah");
        System.out.println(s);
        s.pop(); //removes the last element
        System.out.println(s);
        System.out.println(s.peek()); //return the last element
        s.add(2,"jijijiji");
        System.out.println(s);
        s.push("pk");
        System.out.println(s);
        System.out.println(s.search("pk"));
        System.out.println(s.contains("pk"));
        s.add(123);
        System.out.println(s);


    }
}
