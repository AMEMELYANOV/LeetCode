package stepic.java_interview.Ex2_4.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

    public static void main(String[] args) {
        List<Integer> list = generateBadList();
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println(sum);
    }

    static List<Integer> generateBadList() {
        // enter your code
        List list = new ArrayList();
        for (int i = 0; i < 15; i++) {
            list.add(new Integer(i));
        }
        list.add(new Double(1));
        return (List<Integer>) list;
    }
}
