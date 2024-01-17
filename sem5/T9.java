package JavaSeminars.sem5;

import java.util.LinkedHashMap;
import java.util.Map;

public class T9 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> cache = new LinkedHashMap<>(5, 0.75f, true) {
            @Override // переопределение метода
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > 5;
            }
        };

        // Добавляем элементы в кеш
        for (int i = 0; i < 10; i++) {
            cache.put("Key" + i, i);
        }

        // После добавления 10 элементов, останутся только последние 5, так как старые автоматически удаляются
        System.out.println(cache);
    }
}
