package test.functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        F<String> f = System.out::println;
        f.doIT("111");

        F<Integer> integerF = new FImpl<>();
        integerF.doIT(123);

        List<? extends Number> list = List.of(1, 2, 3, 3f, 4.0);
        list.forEach(System.out::println);

        List<? super Number> list1 = new ArrayList<>();
        list1.add(1);
        list1.get(0);
        list1.forEach(System.out::println);



    }
}
