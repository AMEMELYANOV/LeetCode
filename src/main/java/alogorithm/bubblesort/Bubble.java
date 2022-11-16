package alogorithm.bubblesort;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{4, 3, 5, 6, 3, 2, 10, 1})));
        System.out.println(Arrays.toString(bubbleSort(new int[]{1, 2, 3, 4, 5, 6, 7, 10})));
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return arr;
    }

}
