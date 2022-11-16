package test.functional_interface;

@FunctionalInterface
public interface F<T> {
    int i = 3;

    static void printf(){}

    default void print() {}

    void doIT(T t);
}
