package JavaSeminars.sem1;

public class HT1 {
    public static void main(String[] args) { 
          int n = 0;
          
          if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 4;
          }
          else{
            n = Integer.parseInt(args[0]);
          }     
          
            // Вывод результата на экран
          Answer ans = new Answer(); 
          int itresume_res = ans.countNTriangle(n);     
          System.out.println(itresume_res);
    }
}
    
    class Answer {
        public int countNTriangle(int n){
          // Введите свое решение ниже
            int itresume_res = 0;
            if (n < 1) {
               itresume_res = -1;
            } 
            for (int i = n; i > 0; i--) {
                itresume_res += i;
                }
            return itresume_res;
          // Введите свое решение выше
        }
    }
    

