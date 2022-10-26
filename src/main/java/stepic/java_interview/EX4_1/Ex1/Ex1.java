package stepic.java_interview.EX4_1.Ex1;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;

public class Ex1 {

    static <T> void printAllClassFields(Class<T> aClass) {
        //enter your code
        Field[] fields = aClass.getDeclaredFields();
        Arrays.stream(fields)
                .peek(f -> f.setAccessible(true))
                .map(Field::getName)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        A a = new A(10, "name");
        printAllClassFields(a.getClass());
    }
}

class A {
    final int age;
    final String name;
    String bame;

    public A(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
