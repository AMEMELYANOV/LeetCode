package stepic.java_interview.Ex1_1;

public class Ex_1 {

    public static void main(String[] args) {
        fizzBuzzPrint2(3);
        fizzBuzzPrint2(15);
    }

    static void fizzBuzzPrint(int i) {
        // enter your code
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }

    static void fizzBuzzPrint2(int i) {
        // enter your code
        String result = i % 3 == 0 && i % 5 == 0 ? "FizzBuzz" :
                i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz"
                : String.valueOf(i);
        System.out.println(result);
    }


}
