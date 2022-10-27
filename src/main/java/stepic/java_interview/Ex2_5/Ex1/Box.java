package stepic.java_interview.Ex2_5.Ex1;

class Box<T> {
    private final T value;

    Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}