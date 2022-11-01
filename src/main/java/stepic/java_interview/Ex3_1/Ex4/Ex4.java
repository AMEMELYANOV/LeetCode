package stepic.java_interview.Ex3_1.Ex4;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Ex4 {

    public static void main(String[] args) {
        Map<DayOfWeek, WorkingDayTime> dayTimeMap = Map.of(
                DayOfWeek.MONDAY, new MyWorkingDayTime(LocalTime.of(9, 0), LocalTime.of(17, 0)),
                DayOfWeek.TUESDAY, new MyWorkingDayTime(LocalTime.of(9, 0), LocalTime.of(17, 0)),
                DayOfWeek.WEDNESDAY, new MyWorkingDayTime(LocalTime.of(9, 0), LocalTime.of(17, 0)),
                DayOfWeek.FRIDAY, new MyWorkingDayTime(LocalTime.of(9, 0), LocalTime.of(17, 0)),
                DayOfWeek.SATURDAY, new MyWorkingDayTime(LocalTime.of(10, 0), LocalTime.of(19, 0))
        );
        System.out.println(getOperationTime(dayTimeMap));
    }

    static String getOperationTime(Map<DayOfWeek, WorkingDayTime> dayTimeMap) {
        // enter your code
        List<String> list = new ArrayList<>();
        if (dayTimeMap.isEmpty()) {
            return null;
        }
        for (DayOfWeek day : DayOfWeek.values()) {
            String text = "";
            switch (day) {
                case MONDAY:
                    WorkingDayTime time = dayTimeMap.get(day);
                    if (time != null) {
                        text = String.format("%s %s-%s", engDayToRusDay(day), time.getStart(), time.getEnd());
                    } else {
                        text = String.format("%s выходной", engDayToRusDay(day));
                    }
                    list.add(text);
                    break;
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                case FRIDAY:
                case SATURDAY:
                case SUNDAY:
                    time = dayTimeMap.get(day);
                    WorkingDayTime lastTime = dayTimeMap.get(DayOfWeek.values()[day.ordinal() - 1]);
                    if (lastTime != null) {
                        if (time != null
                                && lastTime.getStart().equals(time.getStart())
                                && lastTime.getEnd().equals(time.getEnd())) {
                            int index = list.size() - 1;
                            String temp = list.get(index);
                            temp = temp.substring(0, 2) + "-" + engDayToRusDay(day) + temp.substring(temp.length() - 12);
                            list.set(index, temp);
                        } else if (time != null) {
                            text = String.format("%s %s-%s", engDayToRusDay(day), time.getStart(), time.getEnd());
                            list.add(text);
                        } else {
                            text = String.format("%s выходной", engDayToRusDay(day));
                            list.add(text);
                        }
                    } else {
                        if (time != null) {
                            text = String.format("%s %s-%s", engDayToRusDay(day), time.getStart(), time.getEnd());
                            list.add(text);
                        } else {
                            int index = list.size() - 1;
                            String temp = list.get(index);
                            temp = temp.substring(0, 2) + ", " + engDayToRusDay(day) + " выходной";
                            list.set(index, temp);
                        }

                    }
            }
        }
        return String.join(", ", list);
    }

    static String engDayToRusDay(DayOfWeek day) {
        String rsl = "";
        switch (day) {
            case MONDAY:
                rsl = "пн";
                break;
            case TUESDAY:
                rsl = "вт";
                break;
            case WEDNESDAY:
                rsl = "ср";
                break;
            case THURSDAY:
                rsl = "чт";
                break;
            case FRIDAY:
                rsl = "пт";
                break;
            case SATURDAY:
                rsl = "сб";
                break;
            case SUNDAY:
                rsl = "вс";
        };
        return rsl;
    }
}
