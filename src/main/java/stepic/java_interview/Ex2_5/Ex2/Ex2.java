package stepic.java_interview.Ex2_5.Ex2;

public class Ex2 {

    public static void main(String[] args) throws Exception {
        Factory<A> factory = new Factory<A>() {
            @Override
            public A generateInstance() throws Exception {
                return super.generateInstance();
            }
        };
        A a = factory.generateInstance();

        Factory<B> factory1 = new Factory<B>() {
            @Override
            public B generateInstance() throws Exception {
                return super.generateInstance();
            }
        };
        B b = factory1.generateInstance();

    }
}
