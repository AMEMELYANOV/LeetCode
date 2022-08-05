package stepic.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String[] strings = reader.readLine().split(" ");
////        List<Integer> helpList = getList();
//        Set<Integer> set = new HashSet<>();
//        //add elements from strings to set
//        set = Arrays.stream(strings)
//                .map(Integer::parseInt)
//                .collect(Collectors.toSet());
//        //add elements from helpList to set
////        set.addAll(helpList);
//        set = removeAllNumbersMoreThan10(set);
//        set.forEach(System.out::println);
        char[] input = "alpha012".toCharArray();
        System.out.println(onlyLowCase(input));

    }

    public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set) {
        //put your code here
        return set.stream().filter(e -> e < 11).collect(Collectors.toSet());
    }

    public static char[] onlyLowCase(char[] input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            if (Character.isAlphabetic(input[i])
                    && Character.isLowerCase(input[i])) {
                builder.append(Character.toUpperCase(input[i]));
            }
        }
        return builder.toString().toCharArray();
    }


}
