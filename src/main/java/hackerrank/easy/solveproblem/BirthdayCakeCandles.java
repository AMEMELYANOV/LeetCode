package hackerrank.easy.solveproblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        long candle = Collections.max(candles);
        return (int) candles.stream()
                .filter(x -> x == candle).count();
    }

    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(Arrays.asList(3, 2, 1, 3)));
    }
}
