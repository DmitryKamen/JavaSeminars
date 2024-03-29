package JavaSeminars.sem3;

import java.util.ArrayList;

public class T6 {
    public static void main(String[] args) {
        // Создаем ArrayList для хранения строк
        ArrayList<String> fruits = new ArrayList<>();

        // Добавляем элементы в список
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add("Банан");

        // Находим индекс первого вхождения "Банан" в списке
        int indexOfBanana = fruits.indexOf("Банан");

        System.out.println("Индекс первого вхождения 'Банан' в списке: " + indexOfBanana);

        // Проверяем, пуст ли список
        boolean isEmpty = fruits.isEmpty();

        System.out.println("Список пустой: " + isEmpty);

        // Удаляем первое вхождение "Банан" из списка
        fruits.remove("Банан");

        // Выводим обновленный список
        System.out.println("Список после удаления первого 'Банана': " + fruits);

        // Удаляем элемент по индексу 1 (второй элемент)
        fruits.remove(1);
    }
}
