package pack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class MyStack {
    private static LinkedList<String> stack;
   
    
    public static void main(String[] args) {
        stack = new LinkedList<>();
        Collections.addAll(stack, "a","b","c","d","e","f");

        push("KORESH");
        System.out.println("Your peek of Linkedlist:  " + peek() );
        System.out.println("Your pop of Linkedlist:  " + pop() );
        System.out.println("Your Linkedlist:  " + stack);
    }

    public static void push(String str) {
        stack.add(str);
        System.out.println("Your Linkedlist:  " + stack);
    }

    public static String peek() {
        String peeka =  stack.get(stack.size()-1);
        return peeka;
    }

    public static String pop() {
        String popa =  stack.get(stack.size()-1);
        stack.set (stack.size()-1, null);
        return popa;
    }
         
    
}
  

