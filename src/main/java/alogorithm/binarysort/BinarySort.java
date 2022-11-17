package alogorithm.binarysort;

public class BinarySort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 10};
        int ind = binarySearch(arr, 5);
        System.out.println(ind);
    }

    public static int binarySearch(int[] arr, int x) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int middleIndex;
        while (startIndex <= endIndex) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (x == arr[middleIndex]) {
                return middleIndex;
            }
            if (x < arr[middleIndex]) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        return -1;
    }
}
