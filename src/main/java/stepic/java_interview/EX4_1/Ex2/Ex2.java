package stepic.java_interview.EX4_1.Ex2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex2 {

    static void callMethodByName(Object object, String methodName, Object... params) throws Exception {
        //enter your code
        Method[] methods = object.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                method.invoke(object, params);
            }
        }
    }

    static void callMethodByNameByMethodHandler(Object object, String methodName, Object... params) throws Throwable {
        //enter your code
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodType mt = MethodType.methodType(void.class, Object[].class);
        MethodHandle helloMethod = lookup.findVirtual(A.class, methodName, mt);
        helloMethod.invokeWithArguments(params);
    }

    public static void main(String[] args) throws Throwable {
        A a = new A();

        callMethodByNameByMethodHandler(a, "sayHello");
//        callMethodByName(a, "sayHello");
//        callMethodByName(a, "sayHello2","the", "best", "world");
    }
}

class A {
    public void sayHello() {
        System.out.println("Hello world!!!");
    }
    public void sayHello2(Object... param) {
        System.out.println("Hello world!!! " + Arrays.toString(param));
    }
}
