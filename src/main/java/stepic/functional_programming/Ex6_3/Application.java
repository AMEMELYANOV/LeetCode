package stepic.functional_programming.Ex6_3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Partitioner {

    public static Map<Boolean, List<Application>> getPartition(List<Application> applications) {
        // write your code here
        return applications.stream().collect(Collectors.partitioningBy(Application::isFree));
    }
}

class Application {
    private final String name;
    private final boolean isFree;

    public Application(String name, boolean isFree) {
        this.name = name;
        this.isFree = isFree;
    }

    public String getName() {
        return name;
    }

    public boolean isFree() {
        return isFree;
    }
}