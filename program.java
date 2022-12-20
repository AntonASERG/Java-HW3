
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class program {

    public static void main(String[] args) {
        ex1();
        ex2();    
    }
    // 1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
    private static void ex1(){
        ArrayList <Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i<10; i++){
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        list.removeIf(n -> (n % 2 == 0)); 
        System.out.println(list);
    }
    // 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. 
    private static void ex2(){
        ArrayList <Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i<10; i++){
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        
        double average = 0.0;
        int sum = 0;
        for(int i=0; i<list.size(); i++){
            sum += list.get(i);
        }
        average = sum / list.size();

        System.out.println(average);
  }

} 
        
        
        

