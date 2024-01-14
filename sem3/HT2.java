package JavaSeminars.sem3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList <Integer> list = new ArrayList<>();
        for (int t : arr) {
            if ( t%2 != 0 ){
                list.add(t);
            }   
        }
        System.out.println(list);

        // List <Integer> list = new ArrayList<>();
        // for (int t : arr) {
        //     list.add(t);
        // }
        // List <Integer> listRes = new ArrayList<>();
        // for (int i = 0; i < list.size(); i++) {
        //     if (list.get(i) % 2 != 0) {
        //         listRes.add(list.get(i));
        // }

       
    }
}


public class HT2 {
    public static void main(String[] args) {
        Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.removeEvenNumbers(arr);
    }
}
