package programmer_career.Exersise_01;

import java.util.HashMap;
import java.util.Map;

public class Ex1_2 {

    public static boolean isStrPerestanovka(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException();
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (Character  c: str1.toCharArray()) {
            map1.computeIfPresent(c, (k, v) -> v + 1);
            map1.putIfAbsent(c, 1);
        }
        for (Character  c: str2.toCharArray()) {
            map2.computeIfPresent(c, (k, v) -> v + 1);
            map2.putIfAbsent(c, 1);
        }
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        isStrPerestanovka("", "");
    }
}
