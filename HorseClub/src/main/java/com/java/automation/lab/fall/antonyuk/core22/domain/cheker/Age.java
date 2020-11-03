package com.java.automation.lab.fall.antonyuk.core22.domain.cheker;

import com.java.automation.lab.fall.antonyuk.core22.domain.constant.TimeZones;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public final class Age {

    private Age() {}

    public static int getAge(Date wasBorn) {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(TimeZones.EUROPE_PARIS));
        cal.setTime(wasBorn);
        int year = cal.get(Calendar.YEAR);
        cal.setTime(new Date());
        return cal.get(Calendar.YEAR) - year;
    }
}
