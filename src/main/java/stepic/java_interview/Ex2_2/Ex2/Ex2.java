package stepic.java_interview.Ex2_2.Ex2;

public class Ex2 {


    public static void main(String[] args) {
        BigNumber number1 = new MyBigNumber("66");
        BigNumber number2 = new MyBigNumber("66");

        System.out.println(number1.add(number2));
    }
}
