package JavaSeminars.sem3;

import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        if (a.length <= 1) {
            return a; 
        }
        int mid = a.length / 2;
        int[] l = new int[mid]; // Создаем левую половину списка
        int[] r = new int[a.length - mid]; // Создаем правую половину списка

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < a.length; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l);
        mergeSort(r);
    
        merge(a, l, r);
        return a;
        
    }
    // Метод для объединения двух отсортированных списков в один
    public static void merge(int [] result, int [] l, int [] r) {
        int i = 0, j = 0, k = 0;

        while (i < l.length && j < r.length) {
            if (l[i] <= r[j]) {
                result[k++] = l[i++];
            }
            else {
                result[k++] = r[j++];
            }
        }
        while (i < l.length) {
            result[k++] = l[i++];
        }
        while (j < r.length) {
            result[k++] = r[j++];
    }
    }
}


public class HT12 {
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
