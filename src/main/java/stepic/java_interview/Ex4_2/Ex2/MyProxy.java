package stepic.java_interview.Ex4_2.Ex2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyProxy {

    static Base createProxy(Base object) throws Exception {
        //enter your code
        ClassLoader baseClassLoader = object.getClass().getClassLoader();
        Class[] baseInterfaces = object.getClass().getInterfaces();
        Base proxyBase = (Base) Proxy.newProxyInstance(baseClassLoader,
                baseInterfaces, new BaseInvocationHandler(object));
        return proxyBase;
    }

    public static void main(String[] args) throws Exception {
        Base base = createProxy(new A());
        base.method1();
        base.method2();
    }
}

class BaseInvocationHandler implements InvocationHandler {
    private Base base;

    public BaseInvocationHandler(Base base) {
        this.base = base;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Method declaredMethod = base.getClass().getDeclaredMethod(method.getName());
        if (declaredMethod.isAnnotationPresent(Logging.class)) {
            System.out.printf("Before call %s%s", method.getName(), System.lineSeparator());
            method.invoke(base);
            System.out.printf("After call %s%s", method.getName(), System.lineSeparator());
        } else {
            method.invoke(base);
        }

        return null;
    }
}
