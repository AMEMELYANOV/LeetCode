package stepic.java_interview.Ex3_1.Ex4;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Map;

import static java.time.DayOfWeek.MONDAY;

public class Ex4 {

    public static void main(String[] args) {
        Map<DayOfWeek, WorkingDayTime> dayTimeMap = Map.of(
                MONDAY, new MyWorkingDayTime(LocalTime.of(9, 0), LocalTime.of(17, 0)),
                DayOfWeek.TUESDAY, new MyWorkingDayTime(LocalTime.of(9, 0), LocalTime.of(17, 0)),
                DayOfWeek.WEDNESDAY, new MyWorkingDayTime(LocalTime.of(9, 0), LocalTime.of(17, 0)),
                DayOfWeek.FRIDAY, new MyWorkingDayTime(LocalTime.of(9, 0), LocalTime.of(17, 0)),
                DayOfWeek.SATURDAY, new MyWorkingDayTime(LocalTime.of(10, 0), LocalTime.of(19, 0))
        );

        System.out.println(getOperationTime(dayTimeMap));

    }

    static String getOperationTime(Map<DayOfWeek, WorkingDayTime> dayTimeMap) {
        // enter your code
        if (dayTimeMap.isEmpty()) {
            return null;
        }
        for (Map.Entry<DayOfWeek, WorkingDayTime> entry : dayTimeMap.entrySet()) {

        }
        return null;
    }

    static String engDayToRusDay(DayOfWeek day)  {
        String result = "";
        switch (day) {
            case MONDAY: result = "пн"; break;
            case TUESDAY: result = "вт"; break;
            case WEDNESDAY: result = "ср"; break;
            case THURSDAY: result = "чт"; break;
            case FRIDAY: result = "пт"; break;
            case SATURDAY: result = "сб"; break;
            case SUNDAY: result = "вн"; break;
        }
        return  result;
    }
}
