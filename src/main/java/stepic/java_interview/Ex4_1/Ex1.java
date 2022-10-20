package stepic.java_interview.Ex4_1;

import java.util.List;
import java.util.stream.Stream;

public class Ex1 {

    public static void main(String[] args) {

    }

    static Stream<String> uniqueNameStream(Stream<Organization> organizationStream) {
        //enter your code
        return organizationStream
                .filter(o -> o.getWorkers().size() > 7)
                .flatMap(o -> o.getWorkers().stream())
                .map(Worker::getName)
                .distinct();
    }

    interface Organization {
        List<Worker> getWorkers();
    }

    interface Worker {
        String getName();
    }
}
