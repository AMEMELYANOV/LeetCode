package stepic.java_interview.Ex4_3.Ex2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PoolOperation {

    static Map<String, Operation> createPoolOperation(List<Object> objects) throws Exception {
        //enter your code
        Map<String, Operation> operationMap = new HashMap<>();
        for (Object object : objects) {
            Arrays.stream(object.getClass().getDeclaredMethods())
                    .peek(method -> method.setAccessible(true))
                    .filter(method -> method.isAnnotationPresent(BotRequestMapping.class))
                    .forEach(method -> operationMap.put(method.getAnnotation(BotRequestMapping.class).value(),
                            () -> method.invoke(object)));
        }
            return operationMap;
    }

    public static void main(String[] args) throws Exception {
        List<Object> objects = List.of(new A());
        Map<String, Operation> poolOperation = createPoolOperation(objects);

        poolOperation.get("hello").call();
        poolOperation.get("goodbye").call();


    }
}
