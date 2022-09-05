package stepic.java_interview.Ex1_1;

public class Ex_4 {

    public static void main(String[] args) {
        calculateAndPrint(1111);
        calculateAndPrint(1211);
    }

    static void calculateAndPrint(int n) {
        // enter your code
        System.out.println(n % 1000 / 100 % 2 == 0 ? n + 100 : n * 2);
    }
}
