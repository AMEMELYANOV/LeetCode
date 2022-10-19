package test.abstract_class;

public class AbstractRunner {
    public static void main(String[] args) {
        MyAbstractClass myAbstractClass = new MyAbstractClass("Hello", 2) {
            @Override
            void myAbstractMethod() {
                System.out.println("myAbstractMethod");
            }
        };

        myAbstractClass.myAbstractMethod();
    }
}
