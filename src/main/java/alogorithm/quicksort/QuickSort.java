package alogorithm.quicksort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr1 = new int[]{4, 3, 5, 6, 3, 2, 10, 1};
        quickSort(arr1, 0, arr1.length - 1);
        int [] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 10};
        quickSort(arr2, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr1));
    }

    public static void quickSort(int[] arr, int from, int to) {
        if (from < to) {
            int divideIndex = partition(arr, from, to);
            quickSort(arr, from, divideIndex - 1);
            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int leftIndex = from;
        int rightIndex = to;
        int pivot = arr[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int arr[], int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}
