import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Написать программу, которая будет проверять, является ли слово из пяти букв, палиндромом (примеры: «комок», «ротор») и возвращает true/false.
        String word = "комоК";
        if (word.equalsIgnoreCase(new StringBuilder(word).reverse().toString())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //    Напишите Java-программу для итерации объекта типа HashMap с использованием цикла while и улучшенного цикла for.
        Map<String, Integer> map = new HashMap<>();
        map.put("11", 1);
        map.put("12", 2);
        map.put("13", 3);
        map.put("14", 4);
        map.put("15", 5);
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()
        ) {
            sum = sum + entry.getValue();
        }
        System.out.println(sum);
        Iterator iterator = map.entrySet().iterator();
        sum = 0;
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey());
            Integer s = (Integer) entry.getValue();
            sum = sum + s;

        }
        System.out.println(sum);

    }


}