package stepic.java_interview.Ex1_1;

public class Ex_5 {

    public static void main(String[] args) {
        checkSortArrayLength(new int[]{2, 1, 4, 1, 2, 3, 4, 5, 6, 7, 3, 1});
        checkSortArrayLength(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11});
        checkSortArrayLength(new int[]{});
        checkSortArrayLength(new int[]{1});

        System.out.println("===========================");

        checkSortArrayLength2(new int[]{2, 1, 4, 1, 2, 3, 4, 5, 6, 7, 3, 1});
        checkSortArrayLength2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11});
        checkSortArrayLength2(new int[]{});
        checkSortArrayLength2(new int[]{1});
    }

    static void checkSortArrayLength(int[] array) {
        // enter your code
        int count = array.length == 1 ? 1 : 0;
        int tempCount = 0;
        int temp = array.length > 0 ? array[0] : 0;
        for (int i = 0; i < array.length; i++) {
            if (temp <= array[i]) {
               temp = array[i];
               tempCount++;
            }
            else {
                temp = array[i];
                count = Math.max(count, tempCount);
                tempCount = 1;
            }
            count = Math.max(count, tempCount);
        }
        System.out.println(count);
    }

    static void checkSortArrayLength2(int[] array) {
        // enter your code
        int l = array.length > 0 ? 1 : 0;
        int res = l;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                l += 1;
            } else {
                if (l > res) {
                    res = l;
                }
                l = 1;
            }
        }
        System.out.println(l > res ? l : res);
    }
}
