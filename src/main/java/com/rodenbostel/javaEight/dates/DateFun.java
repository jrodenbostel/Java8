package com.rodenbostel.javaEight.dates;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Created by justin on 10/6/16.
 */
public class DateFun {

    Clock clock = Clock.systemDefaultZone();
    long millis = clock.millis();

    Instant instant = clock.instant();
    Date legacyDate = Date.from(instant);

    ZoneId zone1 = ZoneId.of("Europe/Berlin");
    ZoneId zone2 = ZoneId.of("Brazil/East");

    LocalTime now1 = LocalTime.now(zone1);
    LocalTime now2 = LocalTime.now(zone2);

    long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
    long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);

    LocalDate today = LocalDate.now();
    LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
    LocalDate yesterday = tomorrow.minusDays(2);

    public Clock getClock() {
        return clock;
    }

    public long getMillis() {
        return millis;
    }

    public Instant getInstant() {
        return instant;
    }

    public Date getLegacyDate() {
        return legacyDate;
    }

    public ZoneId getZone1() {
        return zone1;
    }

    public ZoneId getZone2() {
        return zone2;
    }

    public LocalTime getNow1() {
        return now1;
    }

    public LocalTime getNow2() {
        return now2;
    }

    public long getHoursBetween() {
        return hoursBetween;
    }

    public long getMinutesBetween() {
        return minutesBetween;
    }

    public LocalDate getToday() {
        return today;
    }

    public LocalDate getTomorrow() {
        return tomorrow;
    }

    public LocalDate getYesterday() {
        return yesterday;
    }
}
