package stepic.java_interview.Ex3_1;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Ex3 {

    public static void main(String[] args) {
        System.out.println(instantToDate(Instant.now()));

    }

    static Date instantToDate(Instant instant) {
        // enter your code
        instant = instant.truncatedTo(ChronoUnit.MILLIS);
        Instant maxDateInstant = new Date(Long.MAX_VALUE).toInstant();
        Instant minDateInstant = new Date(Long.MIN_VALUE).toInstant();
        if (instant.compareTo(maxDateInstant) > 0) {
            instant = maxDateInstant;
        } else if (instant.compareTo(minDateInstant) < 0) {
            instant = minDateInstant;
        }
        return Date.from(instant);
    }

}
