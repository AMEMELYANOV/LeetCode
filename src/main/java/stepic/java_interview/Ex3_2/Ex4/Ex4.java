package stepic.java_interview.Ex3_2.Ex4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex4 {

    public static void main(String[] args) {
        List<Worker> workers = List.of(
                new MyWorker("1"),
                new MyWorker("1"),
                new MyWorker("1"),
                new MyWorker("2"),
                new MyWorker("3"),
                new MyWorker("3")
        );

        Map<String, List<Worker>> actual = workers.stream()
                .collect(
                        // enter your code
                        Collectors.groupingBy(Worker::getPosition)
                );

        System.out.println(actual);
    }
}
