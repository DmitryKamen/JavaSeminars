package JavaSeminars.sem3;

import java.util.ArrayList;

public class T4 {
    public static void main(String[] args) {
        // Создаем ArrayList для хранения строк
        ArrayList<String> fruits = new ArrayList<>();

        // Добавляем элементы в список
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");

        // Выводим список до удаления
        System.out.println("Список до удаления: " + fruits);

        // Удаляем все элементы из списка
        fruits.clear();

        // Выводим пустой список после удаления
        System.out.println("Список после удаления: " + fruits);
    }
    
}
