package stepic.java_interview.Ex4_3.Ex1;

class A {
    @Autowired
    B b;

    C c;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
}