package JavaSeminars.sem5;

import java.util.HashMap;

public class T4 {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Анна", 25);
        ageMap.put("Иван", 30);
        ageMap.put("Мария", 28);
        
        // Очищаем HashMap
        ageMap.clear();
        System.out.println("HashMap после очистки: " + ageMap);

        // Создаем другую HashMap
        HashMap<String, Integer> newAgeMap = new HashMap<>();
        newAgeMap.put("Иван", 30);
        newAgeMap.put("Мария", 28);

        // Добавляем все элементы из newAgeMap в ageMap
        ageMap.putAll(newAgeMap);
        System.out.println("HashMap после добавления элементов из другой карты: " + ageMap);

        // // Создаем другую HashMap
        // HashMap<String, Integer> newAgeMap = new HashMap<>();
        // newAgeMap.put("Иван", 30);
        // newAgeMap.put("Мария", 28);
    }
}
