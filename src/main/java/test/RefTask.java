package test;

public class RefTask {
    public static void main(String[] args) {
        StringBuilder value = new StringBuilder(1);
        RefTask.change(value);
        System.out.println(value);
    }

    public static void change(StringBuilder value) {
//        ++value;
       value.append(123);
    }
}
