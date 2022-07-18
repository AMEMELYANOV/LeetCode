package easy.october2021;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        boolean rsl = true;
        List<Integer> list = new ArrayList<>();
        if (x < 0) {
            rsl = false;
        } else {
            while (x > 0) {
                list.add(x % 10);
                x = x / 10;
            }
            for (int i = 0; i < list.size() / 2; i++) {
                if (list.get(i) != list.get(list.size() - 1 - i)) {
                    rsl = false;
                    break;
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        PalindromeNumber number = new PalindromeNumber();
        System.out.println(number.isPalindrome(121));
        System.out.println(number.isPalindrome(-121));
        System.out.println(number.isPalindrome(10));
        System.out.println(number.isPalindrome(-101));

    }

    public boolean isPalindrome2(int x) {
        int remainder = 0;
        int temp = x;
        while (x > 0) {
            remainder =  (remainder * 10 )+ (x % 10);
            x = x / 10;
        }

        if (remainder == temp) {
            return true;
        }
        return false;
    }
}
