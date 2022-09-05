package stepic.test.Ex2_1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.computeIfPresent(c, (k, x) -> x + 1);
            map.putIfAbsent(c, 1);
        }
        for (Map.Entry<Character, Integer> c : map.entrySet()) {
            System.out.printf("%s%s", c.getValue(), c.getKey());
        }


    }
}
