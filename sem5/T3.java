package JavaSeminars.sem5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class T3 {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Анна", 25);
        ageMap.put("Иван", 30);
        ageMap.put("Мария", 28);

        // Получаем коллекцию значений
        Collection<Integer> values = ageMap.values();
        System.out.println("Коллекция значений: " + values);

        // Получаем набор записей (ключ-значение)
        Set<Map.Entry<String, Integer>> entries = ageMap.entrySet();
        System.out.println("Набор записей: " + entries);

        
    }
}
