package alogorithm.sortvibor;

import java.util.Arrays;

public class ViborSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(viborSort(new int[]{4, 3, 5, 6, 3, 2, 10, 1})));
        System.out.println(Arrays.toString(viborSort(new int[]{1, 2, 3, 4, 5, 6, 7, 10})));
    }

    public static int[] viborSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minInd = getMinIndex(arr, i);
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
        return arr;
    }

    private static int getMinIndex(int[] arr, int indStart) {
        int minIndex = indStart;
        int min = arr[indStart];
        for (int i = indStart + 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
