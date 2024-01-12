package JavaSeminars.sem3;

import java.util.ArrayList;

public class T5 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Добавляем элементы в список
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");
        // Проверяем, содержит ли список элемент "Банан"
        
        boolean containsBanana = fruits.contains("Банан");

        // Проверяем, содержит ли список элемент "Груша"
        boolean containsPear = fruits.contains("Груша");

        System.out.println("Список содержит 'Банан': " + containsBanana);
        System.out.println("Список содержит 'Груша': " + containsPear);

        // Получаем элемент по индексу
        String secondFruit = fruits.get(1);

        // Выводим второй элемент
        System.out.println("Второй элемент списка: " + secondFruit);
    }
}
