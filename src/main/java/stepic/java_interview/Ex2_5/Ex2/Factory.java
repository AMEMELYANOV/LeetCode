package stepic.java_interview.Ex2_5.Ex2;

import java.lang.reflect.ParameterizedType;

abstract class Factory<T> {
    public Factory() {

    }

    public T generateInstance() throws Exception {
        // enter you code
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        Class<T> aClass = (Class<T>) type.getActualTypeArguments()[0];
        return aClass.getDeclaredConstructor().newInstance();
    }
}
