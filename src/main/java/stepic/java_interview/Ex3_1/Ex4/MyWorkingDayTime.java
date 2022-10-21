package stepic.java_interview.Ex3_1.Ex4;

import java.time.LocalTime;

public class MyWorkingDayTime implements WorkingDayTime{
    private LocalTime start;
    private LocalTime end;

    public MyWorkingDayTime(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public LocalTime getStart() {
        return start;
    }

    @Override
    public LocalTime getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "MyWorkingDayTime{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
