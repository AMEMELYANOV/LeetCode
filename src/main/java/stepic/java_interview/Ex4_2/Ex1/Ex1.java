package stepic.java_interview.Ex4_2.Ex1;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {

    static void callMethodByWeight(Object object) throws Exception {
        //enter your code
        Method[] methods = object.getClass().getDeclaredMethods();
        List<Method> list = Arrays.stream(methods)
                .filter(m -> m.isAnnotationPresent(Weight.class))
                .sorted(Comparator.comparing(m -> m.getAnnotation(Weight.class).value()))
                .collect(Collectors.toList());

        for (Method m : list
        ) {
            m.invoke(object);
        }
    }

    public static void main(String[] args) throws Exception {
        A a = new A();
        callMethodByWeight(a);
    }
}

