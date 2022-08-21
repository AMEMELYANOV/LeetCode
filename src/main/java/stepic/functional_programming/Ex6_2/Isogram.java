package stepic.functional_programming.Ex6_2;

import java.util.LongSummaryStatistics;
import java.util.Scanner;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class Isogram {

    public static boolean isIsogram(String word) {
        // write your code here
        return word.length() == word.chars().distinct().count();
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String word = scanner.nextLine();
//
//        System.out.println(isIsogram(word));


        LongSummaryStatistics stream = LongStream.empty().summaryStatistics();
        System.out.println(stream.getSum());
    }
}
