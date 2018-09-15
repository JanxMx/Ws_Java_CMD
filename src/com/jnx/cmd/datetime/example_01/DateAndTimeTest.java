package com.jnx.cmd.datetime.example_01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateAndTimeTest {

    /**
     * The LocalDate class represents a date. 
     * There is no representation of a time or time-zone.
     */
    public void printLocalDate() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());                // 2018-08-29
        System.out.println(localDate.getDayOfWeek().toString()); // WEDNESDAY
        System.out.println(localDate.getDayOfMonth());           // 29
        System.out.println(localDate.getDayOfYear());            // 200
        System.out.println(localDate.isLeapYear());              // false
        System.out.println(localDate.plusDays(12).toString());   // 2018-09-10
    }

    /**
     * The LocalTime class represents a time.
     * There is no representation of a date or time-zone.
     */
    public void printLocalTime() {
        //LocalTime localTime = LocalTime.now();        // toString() in format 09:57:59.744
        LocalTime localTime = LocalTime.of(12, 20);
        System.out.println(localTime.toString());   // 12:20
        System.out.println(localTime.getHour());    // 12
        System.out.println(localTime.getMinute());  // 20
        System.out.println(localTime.getSecond());  // 0
        System.out.println(localTime.MIDNIGHT);     // 00:00
        System.out.println(localTime.NOON);         // 12:00
    }

    /**
     * The LocalDateTime class represents a date-time.
     * There is no representation of a time-zone.
     */
    public void printLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.toString());       // 2018-08-29T16:50:14.911
        System.out.println(localDateTime.getDayOfMonth());  // 29
        System.out.println(localDateTime.getHour());        // 10
        System.out.println(localDateTime.getNano());        // 911000000
    }

}