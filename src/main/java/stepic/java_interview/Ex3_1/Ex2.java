package stepic.java_interview.Ex3_1;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Ex2 {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        String zoneName = "Europe/Berlin";

        System.out.println(toMoscowTime(localDateTime, zoneName));
    }

    static LocalDateTime toMoscowTime(LocalDateTime localDateTime, String zoneName) {
        // enter your code
        Instant instant = localDateTime.atZone(ZoneId.of(zoneName)).toInstant();
        return LocalDateTime.ofInstant(instant, ZoneId.of("Europe/Moscow"));
    }
}
