package Nov_exercises.exe_21112024;

import java.util.PrimitiveIterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab_083_Queue {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue() ;
        // add --- offer
        q.add(123);
        q.offer(34);
        //q.offer("Suman");
        //q.offer(878.56d);
        //q.add("pk");
        q.poll();
        System.out.println(q);

}}
