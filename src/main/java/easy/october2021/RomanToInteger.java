package easy.october2021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> digits = new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        int rsl = 0;
        digits.put('I', 1);
        digits.put('V', 5);
        digits.put('X', 10);
        digits.put('L', 50);
        digits.put('C', 100);
        digits.put('D', 500);
        digits.put('M', 1000);
        for (char c : s.toCharArray()) {
            if (!digits.containsKey(c)) {
                return 0;
            }
            lst.add(digits.get(c));
        }
        for (int i = 0; i < lst.size() - 1; i++) {
            rsl = lst.get(i) < lst.get(i + 1) ? rsl - lst.get(i) : rsl + lst.get(i);
        }
        rsl += lst.get(lst.size() - 1);
        return rsl;
    }

    public static void main(String[] args) {
        RomanToInteger roman = new RomanToInteger();
        System.out.println(roman.romanToInt("LVIII"));
    }

    public int romanToInt2(String s) {
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int result = m.get(s.charAt(s.length() - 1));

        for (int back = s.length() - 2; back >= 0; back--) {
            if (m.get(s.charAt(back)) < m.get(s.charAt(back + 1))) {
                result -= m.get(s.charAt(back));
            } else {
                result += m.get(s.charAt(back));
            }
        }

        return result;
    }
}
