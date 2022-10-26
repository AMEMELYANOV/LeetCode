package stepic.java_interview.Ex4_3.Ex1;

class B {
    @Autowired
    C c;

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
}