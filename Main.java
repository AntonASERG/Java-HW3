
import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {
        String str1 = new String("Трус");
        String str2 = new String("Балбес");
        String str3 = new String("Бывалый");
        String str4 = new String("Шурик");

       LinkedList<String> a = new LinkedList<>();
       a.add(str1);
       a.add(str2);
       a.add(str3);
       a.add(str4);

       System.out.println(a);
       
       int temp = 0;
        while (temp != a.size() - 1) {
            a.add(a.size()-temp, a.getFirst());
            a.removeFirst();
            temp++;
        }
        System.out.println("КРУУГОМ! :" + a);

    
    }
} 
        
        
        

