package java_intermediate.part4_날짜와_시간;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {

    public static void main(String[] args) {
        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println(timePoint);

        LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12);
        System.out.println(ld1);

        LocalTime lt1 = LocalTime.of(17, 18);
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.parse("00:15:30");
        System.out.println(lt2);

        LocalDate theDate = timePoint.toLocalDate();
        System.out.println(theDate);
        System.out.println(timePoint.getMonthValue());
        System.out.println(timePoint.getMonth());
        Month month = timePoint.getMonth();
        System.out.println(month.getValue());
        System.out.println(timePoint.getHour());
    }
}
