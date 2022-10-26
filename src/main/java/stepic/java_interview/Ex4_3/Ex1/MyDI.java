package stepic.java_interview.Ex4_3.Ex1;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyDI {

    static void dependencyInjection(List<Object> objects) throws Exception {
        Map<? extends Class<?>, Object> objectMap = objects.stream()
                .collect(Collectors.toMap(Object::getClass, Function.identity()));

        for (Object target : objects) {
            Class<?> aClass = target.getClass();
            Field[] fields = aClass.getDeclaredFields();

            for (Field field : fields) {
                if (field.isAnnotationPresent(Autowired.class)) {
                    if (!objectMap.containsKey(field.getType())) {
                        throw new CandidateNotFindException();
                    }

                    field.setAccessible(true);
                    field.set(target, objectMap.get(field.getType()));
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        List<Object> objects = List.of(new A(), new B(), new C());
        dependencyInjection(objects);
        System.out.println();
    }
}
