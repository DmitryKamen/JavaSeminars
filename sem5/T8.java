package JavaSeminars.sem5;

import java.util.LinkedHashMap;
import java.util.Map;

public class T8 {
    public static void main(String[] args) {
        // Создаем LinkedHashMap для хранения имен и их возрастов
        LinkedHashMap<String, Integer> ageMap = new LinkedHashMap<>();

        // Добавляем элементы в LinkedHashMap
        ageMap.put("Анна", 25);
        ageMap.put("Иван", 30);
        ageMap.put("Мария", 28);

        System.out.println("LinkedHashMap после добавления: " + ageMap);

        // Получаем возраст по имени
        int annaAge = ageMap.get("Анна");
        System.out.println("Возраст Анны: " + annaAge);

        // Удаляем элемент по имени
        ageMap.remove("Иван");
        System.out.println("LinkedHashMap после удаления: " + ageMap);

        // Проверяем наличие ключа
        boolean hasAnna = ageMap.containsKey("Анна");
        System.out.println("Есть ли ключ 'Анна'? " + hasAnna);

        // Получаем количество элементов
        int size = ageMap.size();
        System.out.println("Количество элементов в LinkedHashMap: " + size);

        // Проверяем, пуст ли LinkedHashMap
        boolean isEmpty = ageMap.isEmpty();
        System.out.println("LinkedHashMap пустой? " + isEmpty);



    }

    // public static void main(String[] args) {
    //     LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

    //     linkedHashMap.put("one", 1);
    //     linkedHashMap.put("two", 2);
    //     linkedHashMap.put("three", 3);

    //     // Перебор элементов в порядке добавления
    //     for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
    //         System.out.println(entry.getKey() + ": " + entry.getValue());
    //     }
    // }

    // public static void main(String[] args) {
    //     LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

    //     linkedHashMap.put("one", 1);
    //     linkedHashMap.put("two", 2);
    //     linkedHashMap.put("three", 3);

    //     // Итерирование элементов в LinkedHashMap
    //     for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
    //         String key = entry.getKey();
    //         Integer value = entry.getValue();
    //         System.out.println("Ключ: " + key + ", Значение: " + value);
    //     }
    // }
}
