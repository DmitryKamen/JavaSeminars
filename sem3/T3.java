package JavaSeminars.sem3;

import java.util.ArrayList;

public class T3 {
    public static void main(String[] args) {
        // Создаем ArrayList для хранения строк
        ArrayList<String> fruits = new ArrayList<>();

        ArrayList<String> additionalFruits = new ArrayList<>();

        // Добавляем элементы в конец списка
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");

        // Выводим список
        System.out.println("Список после добавления элементов: " + fruits);

        // Добавляем новый элемент в конец списка
        fruits.add("Груша");

        // Добавляем элементы во второй список
        additionalFruits.add("Груша");
        additionalFruits.add("Вишня");

        fruits.addAll(additionalFruits);

        // Выводим обновленный список
        System.out.println("Список после добавления нового элемента: " + fruits);
    }
    
}
