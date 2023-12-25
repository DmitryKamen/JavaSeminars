package JavaSeminars.sem2;

public class HT1{
    public static void main(String[] args) { 
        String QUERY = "";
        String PARAMS = "";
      
        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
	        PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }     
      
        Answer ans = new Answer();      
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}

class Answer {  
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        StringBuilder builder = new StringBuilder(QUERY + LineInList(PARAMS));
        
        return builder;
    }
    public static StringBuilder LineInList(String str) {
        String line1 = str.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        System.out.println(line3);
        StringBuilder result = new StringBuilder();

        String [] arrayData = line3.split(", ");
        for (int i =0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            if(arrData[1].equals("null") == false) {
                if (i != 0) {
                    result.append(" and ");
                    result.append(arrData[0]);
                    result.append("=" );
                    result.append("'");
                    result.append(arrData[1]);
                    result.append("'");
                } 
                else {
                    result.append(arrData[0]);
                    result.append("=");
                    result.append("'");
                    result.append(arrData[1]);
                    result.append("'");
                }
            } 

        }
        return result;
    }
}


// if(arrData[1].equals("null") == false)

