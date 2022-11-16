package alogorithm.sortvibor;

import java.util.Arrays;

public class ViborSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(viborSort(new int[]{4, 3, 5, 6, 3, 2, 10, 1})));
        System.out.println(Arrays.toString(viborSort(new int[]{1, 2, 3, 4, 5, 6, 7, 10})));
    }

    public static int[] viborSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (arr[i] > arr[minIndex]) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
}
