package stepic.java_interview.Ex3_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex2 {
    List<Organization> organizations = new ArrayList<>();

    Map<Integer, Organization> actual = organizations.stream()
            .collect(
                    // enter your code
                    Collectors.toMap(Organization::getId, Function.identity())
            );

    interface Organization {
        int getId();
    }
}



