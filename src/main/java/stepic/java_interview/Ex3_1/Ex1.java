package stepic.java_interview.Ex3_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Ex1 {

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date.format(format()));
    }

    static DateTimeFormatter format() {
        // enter your code
        return DateTimeFormatter.ofPattern("yyyy-'M'M-'W'W-EEE:HH:mm", Locale.UK);
    }

}
