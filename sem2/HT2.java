package JavaSeminars.sem2;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;


class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
        try {
            log = new File("log.txt");
            if (!log.exists()) {
                // Создаем новый файл, если он не существует
                log.createNewFile();
            }
            fileWriter = new FileWriter(log, false);   
            int n = mas.length;
            boolean flag = false;
            for (int i = 0; i < n; i++){
                flag = false;
                for (int j = 0; j < n - 1; j++){
                    if (mas[j] > mas[j + 1]){
                        int temp = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = temp;
                        flag = true;  
                    }  
                }
                if(flag) {
                fileWriter.append(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()) + " " + Arrays.toString(mas) + "\n");
                fileWriter.flush();
                }          
            }
            fileWriter.append(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()) + " " + Arrays.toString(mas) + "\n");
            fileWriter.flush();
            
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }
}
    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class HT2{ 
    public static void main(String[] args) { 
      int[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new int[]{9, 4, 8, 3, 1};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
      }      
      BubbleSort ans = new BubbleSort();      
      ans.sort(arr);

      try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


