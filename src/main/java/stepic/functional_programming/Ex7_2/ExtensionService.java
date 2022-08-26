package stepic.functional_programming.Ex7_2;

import java.util.function.Function;
import java.util.function.Predicate;

class ExtensionService {

    public static void main(String[] args) {
        Function<String, String> func = addExtension(y -> y.equals("First"), y -> y.equals("Second"));
        System.out.println(func.apply("First"));//should print First.xml
        System.out.println(func.apply("Second"));//should print Second.json
        System.out.println(func.apply("Otherwise"));//should print Otherwise
    }

    public static Function<String, String> addExtension(Predicate<String> p1, Predicate<String> p2) {
        return (s) -> p1.test(s) ? s + ".xml"
                : p2.test(s) ? s + ".json" : s;
    }
}
