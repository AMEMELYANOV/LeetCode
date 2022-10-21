package stepic.java_interview.Ex3_2.Ex3.Ex6;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex6 {
    public static void main(String[] args) {
        List<Worker> workers = List.of(
                new MyWorker("1", 100),
                new MyWorker("1", 150),
                new MyWorker("1", 200),
                new MyWorker("2", 250),
                new MyWorker("3", 300),
                new MyWorker("3", 50)
        );

        Map<String, Double> actual = workers.stream()
                .collect(
                        // enter your code
                        Collectors.groupingBy(Worker::getPosition, Collectors.averagingDouble(Worker::getSalary))
                );

        System.out.println(actual);
    }

}
