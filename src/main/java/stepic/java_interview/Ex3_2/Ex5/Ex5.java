package stepic.java_interview.Ex3_2.Ex5;

import stepic.java_interview.Ex3_2.Ex4.MyWorker;
import stepic.java_interview.Ex3_2.Ex4.Worker;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex5 {
    public static void main(String[] args) {
        List<stepic.java_interview.Ex3_2.Ex4.Worker> workers = List.of(
                new stepic.java_interview.Ex3_2.Ex4.MyWorker("1"),
                new stepic.java_interview.Ex3_2.Ex4.MyWorker("1"),
                new stepic.java_interview.Ex3_2.Ex4.MyWorker("1"),
                new stepic.java_interview.Ex3_2.Ex4.MyWorker("2"),
                new stepic.java_interview.Ex3_2.Ex4.MyWorker("3"),
                new MyWorker("3")
        );

        Map<String, Long> actual = workers.stream()
                .collect(
                        // enter your code
                        Collectors.groupingBy(Worker::getPosition, Collectors.counting())
                );

        System.out.println(actual);
    }
}
