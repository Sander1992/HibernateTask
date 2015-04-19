package com.softserve.edu.hibernatetask.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateHandler {
    private static SimpleDateFormat formater = new SimpleDateFormat("dd.MM.yyyy");

    public static Date parseDate(String date) {
        try {
            return formater.parse(date);
        } catch (ParseException ex) {
            System.err.println("Date parsing failed");
            throw new AssertionError(ex);
        }
    }

    public static String getPrettyDate(Date date) {
        return date.toString().substring(0, 10);
    }
}
