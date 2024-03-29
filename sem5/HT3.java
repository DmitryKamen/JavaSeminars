package JavaSeminars.sem5;

import java.util.Arrays;

class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {
        // Введите свое решение ниже
        for (int i = sortLength / 2 - 1; i >= 0; i--){
            int maxIndex;
            if (i*2+2 <= sortLength-1){
                if (tree[i*2+2] > tree[i*2+1]){
                    maxIndex = i*2+2;
                }
                else maxIndex = i*2+1;
            }
            else maxIndex = i*2+1; 
            if (tree[i] <  tree[maxIndex]){
                int swap = tree[i];
                tree[i] = tree[maxIndex];
                tree[maxIndex] = swap;
            }
        }     
    }
    public static void heapSort(int[] sortArray, int sortLength) {
        // Введите свое решение ниже
        if( sortLength == 0 ) return;
        buildTree(sortArray, sortLength);
        int elem = sortArray[0];
        sortArray[0] = sortArray[sortLength - 1];
        sortArray[sortLength - 1] = elem;
        heapSort(sortArray, sortLength-1);

        
    }
}

public class HT3 {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}
