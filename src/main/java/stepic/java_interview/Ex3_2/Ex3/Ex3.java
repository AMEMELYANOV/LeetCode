package stepic.java_interview.Ex3_2.Ex3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3 {

    public static void main(String[] args) {
        List<Worker> workers = List.of(
                new MyWorker("1", 5),
                new MyWorker("2", 1),
                new MyWorker("3", 7),
                new MyWorker("4", 9),
                new MyWorker("5", 2)
        );

        String actual = workers.stream()
                // enter your code
                .sorted(Comparator.comparing(Worker::getPoints).reversed())
                .limit(3)
                .map(Worker::getName)
                .collect(
                        // enter your code
                        Collectors.joining(", ")
                );

        System.out.println(actual);
    }



}

