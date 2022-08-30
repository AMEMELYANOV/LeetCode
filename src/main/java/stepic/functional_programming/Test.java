package stepic.functional_programming;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test {
    private static final Integer n = 1;

    public static void main(String[] args) {

        Supplier<Double> supplier = Math::random;
        System.out.println(supplier.get());

        Consumer<Integer> consumer = System.out::println;
        consumer.accept(n);
    }
}
