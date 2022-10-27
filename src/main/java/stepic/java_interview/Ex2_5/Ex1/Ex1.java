package stepic.java_interview.Ex2_5.Ex1;

public class Ex1 {
    static Box<Integer> boxingValue(double value) {
        // enter your code
        Box<? extends Number> box = new Box<>(value);
        return (Box<Integer>) box;
    }

    public static void main(String[] args) {
        double d = 10.5;
        Box<Integer> box = boxingValue(d);
        System.out.println(box.getValue());
    }
}
