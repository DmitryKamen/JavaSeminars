package JavaSeminars.sem6;

   

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    private static LinkedHashMap<String, Integer> phoneBookes = new LinkedHashMap<>();
    
        
    public void add(String name, Integer phoneNum) {
        
        
        if(phoneBook.containsKey(name)) {
            int cnt= phoneBook.get(name).size() + 1;
            phoneBook.get(name).add(phoneNum);
            phoneBookes.put(name, cnt);
                        
        }
        else {
            ArrayList<Integer> phones = new ArrayList<>();
            phones.add(phoneNum);
            phoneBook.put(name, phones);
            int cnt = 1;
            phoneBookes.put(name, cnt);
            
        }
        Map <String, Integer> sort = phoneBookes.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(a,b) -> {throw new AssertionError();},LinkedHashMap::new));
        
        phoneBookes.clear();
        phoneBookes.putAll(sort);
    }

    public static void  getPhoneBook() {
        for (String key: phoneBookes.keySet()) {
            ArrayList<Integer> phonesis = phoneBook.get(key);
            System.out.println(key+ " - " +phonesis);
    }
}
}


public class FinalHomeTask {
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;
        int phone1;
        int phone2;
        int phone3;
        name1 = "Ivanov";
        name2 = "Petrov";
        name3 = "Vasilev";
        phone1 = 123456;
        phone2 = 654321;
        phone3 = 321654;

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name2, phone2);
        myPhoneBook.add(name3, phone1);
        myPhoneBook.add(name3, phone2);
        myPhoneBook.add(name3, phone3);
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        
        
        PhoneBook.getPhoneBook();
        
    }
} 