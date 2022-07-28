package stepic.list;

import java.util.*;

public class HashSetSymmetricDifference {
    public static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2){
        //Enter your code below
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        Set<Integer> tmp = new HashSet<>(set1);
        tmp.retainAll(set2);
        result.removeAll(tmp);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(3, 14, 16, 5, 13, 2, 20, 10, 6, 9));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20));

        System.out.println(symDifference(set1, set2));
    }
}
