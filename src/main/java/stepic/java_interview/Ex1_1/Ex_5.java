package stepic.java_interview.Ex1_1;

public class Ex_5 {

    public static void main(String[] args) {
        checkSortArrayLength(new int[]{2, 1, 4, 1, 2, 3, 4, 5, 6, 7, 3, 1});
        checkSortArrayLength(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11});
        checkSortArrayLength(new int[]{});
        checkSortArrayLength(new int[]{1});
    }

    static void checkSortArrayLength(int[] array) {
        // enter your code
        int count = array.length == 1 ? 1 : 0;
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                temp++;
            } else {
                count = temp;
                temp = 0;
            }
            count = Math.max(count, temp);
        }
        System.out.println(count);
    }
}
