package easy.october2021;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LongestCommonPrefix {
    /* Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".

    Example 1:

    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Example 2:

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.


            Constraints:

            1 <= strs.length <= 200
            0 <= strs[i].length <= 200
    strs[i] consists of only lower-case English letters. */

    public static String longestCommonPrefix(String[] strs) {
        String rsl = "";
        int length = Arrays.stream(strs).sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList()).get(0).length();
        for (int i = 0; i < length; i++) {
            char current = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (current != strs[j].charAt(i)) {
                    return rsl;
                }
            }
            rsl += String.valueOf(current);
        }
        return rsl;
    }
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix2(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix2(new String[]{"dog","racecar","car"}));
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
