package test.static_methods;

public class A {
    public static void aaa() {
        System.out.println("aaa");
    }
}

class B extends A {
    public static void aaa() {
        System.out.println("bbb");
    }
}

class Runner {
    public static void main(String[] args) {
        B.aaa();
    }
}
