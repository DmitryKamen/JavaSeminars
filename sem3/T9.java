package JavaSeminars.sem3;

import java.util.ArrayList;

public class T9 {
    public static void main(String[] args) {
        // Создаем ArrayList для хранения строк
        ArrayList<String> fruits = new ArrayList<>();

        // Добавляем элементы в список
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");

        // Получаем строковое представление списка
        String fruitsString = fruits.toString();

        // Выводим строковое представление
        System.out.println("Строковое представление списка: " + fruitsString);
    }
    
}
