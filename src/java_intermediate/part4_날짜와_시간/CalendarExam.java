package java_intermediate.part4_날짜와_시간;

import java.util.Calendar;

public class CalendarExam {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);
        System.out.println(cal.get(Calendar.DATE));

        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));

        cal.add(Calendar.HOUR, 5);
        System.out.println(cal.get(Calendar.HOUR));

    }
}
