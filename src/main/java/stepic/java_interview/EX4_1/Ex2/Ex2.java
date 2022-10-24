package stepic.java_interview.EX4_1.Ex2;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex2 {

    static void callMethodByName(Object object, String methodName, Object... params) throws Exception {
        //enter your code
        if (params.length == 0) {
            Method method = object.getClass().getDeclaredMethod(methodName);
            method.invoke(object);
        } else {
            Method method = object.getClass().getDeclaredMethod(methodName, params.getClass());
            method.invoke(object, new Object[]{params});
        }
    }

    public static void main(String[] args) throws Exception {
        A a = new A();

        callMethodByName(a, "sayHello");
        callMethodByName(a, "sayHello2","the", "best", "world");
    }
}

class A {
    public void sayHello() {
        System.out.println("Hello world!!!");
    }

    public void sayHello2(Object[] param) {
        System.out.println("Hello world!!! " + Arrays.toString(param));
    }
}
