package tests.misc;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.TimeZone;

public class Datatest {
    public static void main(String[] args) {
        LocalTime time = new LocalTime(DateTimeZone.forTimeZone(TimeZone.getTimeZone("America/Chicago"))).withHourOfDay(16).withMinuteOfHour(34).withSecondOfMinute(0);
        DateTime now = DateTime.now(DateTimeZone.UTC);
        DateTime newTime = time.toDateTime(now);

        DateTimeFormatter formatter = DateTimeFormat.forPattern("HH:mm (ZZZ)");

        DateTime dt = formatter.parseDateTime("16:50 (America/New_York)").withZone(DateTimeZone.UTC).toLocalTime().toDateTimeToday(DateTimeZone.UTC);

        int i = 0;
        while (dt.plusDays(i).isBeforeNow()) {
            i++;
        }
        dt = dt.plusDays(i);
        System.out.println(dt);

//        System.out.println(time.toDateTimeToday(DateTimeZone.UTC));
//        System.out.println(dt.toLocalTime().toDateTimeToday(DateTimeZone.UTC));

    }
}
