package hackerrank.easy.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class JavaDateAndTime {

    public static String findDay(int month, int day, int year) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        DateFormat df = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        return df.format(calendar.getTime()).toUpperCase();
    }

    public static void main(String[] args) {
        int day = 14;
        int month = 8;
        int year = 2017;
        System.out.println(findDay(month, day, year));
    }
}
