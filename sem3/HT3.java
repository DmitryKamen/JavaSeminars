package JavaSeminars.sem3;

import java.util.ArrayList;
import java.util.Arrays;


class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        int tempVar = 0;
        for (int i = 0; i < arr.length-1; i++)
        {
            for(int j = 0; j < arr.length-i-1; j++)
            {        
                if(arr[j] > arr[j + 1])
                {
                   tempVar = arr [j + 1];
                   arr [j + 1]= arr [j];
                   arr [j] = tempVar;
                }
            }
        }
        ArrayList <Integer> list = new ArrayList<>();
        for (int t : arr) {
            list.add(t);
        }
        // System.out.println(list); 
        int min = list.get(0);
        int max = 0;
        int sum = 0;
        double count = 0;
        double avg = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);       
            }
            if (list.get(i) > max) {
                max = list.get(i);       
            }
            sum += list.get(i);
            count += 1;
        }
        avg = sum / count;
        
        System.out.println(list);
        System.out.println("Minimum is = " + min);
        System.out.println("Maximum is = " + max);
        System.out.println("Average is = " + avg);

    }
}

public class HT3 {
    public static void main(String[] args) {
        Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.analyzeNumbers(arr);
    }
}

// В автотестах прошел здесь тупит не могу понять почему 