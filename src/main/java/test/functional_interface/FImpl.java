package test.functional_interface;

public class FImpl<T> implements F<T>{

    @Override
    public void doIT(T t) {
        System.out.println(t);
    }
}
