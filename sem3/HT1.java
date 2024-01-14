package JavaSeminars.sem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
        List<Integer> list = convertArrayToList(a);
        mergeSort1(list);
        int [] arr = listToArray(list);
        return arr;

    }

    private static int[] listToArray(List<Integer> list) {
        int [] array = new int[list.size()];
        for (int i = 0; i < array.length; i++)
            array[i] = list.get(i); 
        return array;
    }

    public static List<Integer> convertArrayToList(int a[]){
        List<Integer> list = new ArrayList<>();
        for (int t : a) {
            list.add(t);
        }
        return list;
    }

    public static void mergeSort1(List<Integer> list) {
        // Проверяем базовый случай: если список содержит 1 элемент или меньше, он уже отсортирован
        if (list.size() <= 1) {
            return; // Возвращаемся из метода, не выполняя дополнительных действий
        }

        // Находим средний индекс списка
        int middle = list.size() / 2;

        // Делим список на две половины: левую и правую
        List<Integer> left = new ArrayList<>(list.subList(0, middle)); // Создаем левую половину списка
        List<Integer> right = new ArrayList<>(list.subList(middle, list.size())); // Создаем правую половину списка

        // Рекурсивно сортируем левую и правую половины списка
        mergeSort1(left); // Вызываем метод сортировки слиянием для левой половины
        mergeSort1(right); // Вызываем метод сортировки слиянием для правой половины

        // Объединяем отсортированные половины в исходный список
        merge(list, left, right); // Вызываем метод объединения
    }

    // Метод для объединения двух отсортированных списков в один
    public static void merge(List<Integer> result, List<Integer> left, List<Integer> right) {
        int i = 0, j = 0, k = 0;

        // Пока есть элементы в обеих половинах
        while (i < left.size() && j < right.size()) {
            // Сравниваем элементы левой и правой половин
            if (left.get(i) < right.get(j)) {
                result.set(k, left.get(i)); // Заменяем элемент в исходном списке на элемент из левой половины
                i++;
            } else {
                result.set(k, right.get(j)); // Заменяем элемент в исходном списке на элемент из правой половины
                j++;
            }
            k++;
        }

        // Если остались элементы только в левой или правой половине, добавляем их в исходный список
        while (i < left.size()) {
            result.set(k, left.get(i));
            i++;
            k++;
        }

        while (j < right.size()) {
            result.set(k, right.get(j));
            j++;
            k++;
        }
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class HT1{ 
    public static void main(String[] args) { 
        int[] a;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}
