package JavaSeminars.sem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T5 {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1); // Добавляет элемент в список
        list.addAll(Arrays.asList(2, 3, 4)); // Добавляет несколько элементов
        System.out.println(list);
    }
    
}