package stepic.java_interview.Ex4_1;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();

        static String actual = workers.stream()
                // enter your code
                .sorted(Worker::getPoints)
                .limit(3)
                .collect(
                        // enter your code

                );
    }



}

interface Worker {
    String getName();
    int getPoints();
}