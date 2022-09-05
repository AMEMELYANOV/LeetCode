package stepic.java_interview.Ex2_1;

import java.util.List;

public class Ex_1 {

    void checkFruitCount(Object[] objects) {
        // enter your code
        int bananaNumber = 0;
        int appleNumber = 0;

        for (Object object : objects) {
            if (object instanceof Banana) bananaNumber++;
            if (object instanceof Apple) appleNumber++;
        }

        System.out.printf("banana=%d, apple=%d", bananaNumber, appleNumber);
    }

    public static void main(String[] args) {

    }
}

interface Apple {

}

interface Banana {

}
