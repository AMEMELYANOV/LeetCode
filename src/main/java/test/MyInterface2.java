package test;

public interface MyInterface2 {
    default void start() {
        System.out.println("Start MyInterface2");
    }
}
