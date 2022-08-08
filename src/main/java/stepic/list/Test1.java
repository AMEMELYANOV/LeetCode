package stepic.list;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) throws IOException {
        var input = List.of(
                new Task(1, 1),
                new Task(1, 2),
                new Task(1, 1)
        );
        System.out.println(multiAssign(input));
    }

    public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set) {
        //put your code here
        return set.stream().filter(e -> e < 11).collect(Collectors.toSet());
    }

    public static char[] onlyLowCase(char[] input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            if (Character.isAlphabetic(input[i])
                    && Character.isLowerCase(input[i])) {
                builder.append(Character.toUpperCase(input[i]));
            }
        }
        return builder.toString().toCharArray();
    }

    public static List<Integer> multiAssign(List<Task> tasks) {
        List<Integer> rsl = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (Task task : tasks) {
            map.merge(task.assignId, 1, (prev, one) -> prev + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) > 1) {
                rsl.add(key);
            }
        }
        return rsl;
    }
}

class Task {
    Integer taskId;
    Integer assignId;

    public Task(Integer taskId, Integer assignId) {
        this.taskId = taskId;
        this.assignId = assignId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public Integer getAssignId() {
        return assignId;
    }


}
