package test.abstract_class;

public abstract class MyAbstractClass {
    private String first;
    private int second;

    public MyAbstractClass(String first, int second) {
        this.first = first;
        this.second = second;
    }

    abstract void myAbstractMethod();
}
