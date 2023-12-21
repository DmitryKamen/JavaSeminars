package JavaSeminars.sem1.Printer ;

public class HT2{ 
    public static void main(String[] args) { 
          
        Answer ans = new Answer();      
        ans.printPrimeNums();
    }
}

// public class Printer{ 
//     public static void main(String[] args) { 
      
//       Answer ans = new Answer();      
//       ans.printPrimeNums();
//     }
// }


class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        int cnt = 0;
        for (int i = 2; i <= 1000; i++) {
            for (int j = i; j >= 1; j--) {
                if (i % j == 0 ) {
                    cnt++;
                }
            }
            if ( cnt == 2) {
                System.out.println(i);
            }
            cnt = 0;
        }
        // Напишите свое решение выше
    }
}
