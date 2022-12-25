package pack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class MyQueue {
    private static LinkedList<String> queue;
   
    
    public static void main(String[] args) {
        queue = new LinkedList<>();
        Collections.addAll(queue, "a","b","c","d","e","f");
        
        add("Hello");// добавить в конец
        System.out.println("Your top of Linkedlist:  " + top());
        System.out.println("Your top of Linkedlist:  " + poll());
        System.out.println("Your Linkedlist:  " + queue);
    }

    public static void add(String str) {
        queue.add(0,str);
        System.out.println("Your Linkedlist:  " + queue);
    }

    public static String top() {
        String peeka =  queue.get(0);
        return peeka;
    }

    public static String poll() {
        String popa =  queue.get(0);
        queue.set (0, null);
        return popa;
    }
         
    
}
  

