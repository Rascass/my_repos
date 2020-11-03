package com.java.automation.lab.fall.antonyuk.core22.domain.event.eventFactory;

import com.java.automation.lab.fall.antonyuk.core22.domain.event.EventInfo;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.Excursion;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.TypeExcursion;

import java.util.Date;

public class ExcursionFactory {

    private final static long HOUR = 3600000;
    private final static long FAST_DIFF = HOUR;
    private final static long MIDDLE_DIFF = 2 * HOUR;
    private final static long FULL_DIFF = 3 * HOUR;

    private static Date getFinish(Date start, long hours) {
        return new Date(start.getTime() + hours);
    }

    public static Excursion createExcursion(EventInfo eventInfo, TypeExcursion typeExcursion, Date startDate) {
        long finishDiff = 0;
        switch (typeExcursion) {
            case FAST:
                finishDiff = FAST_DIFF;
                break;
            case MIDDLE:
                finishDiff = MIDDLE_DIFF;
                break;
            case FULL:
                finishDiff = FULL_DIFF;
                break;
        }
        Excursion excursion = new Excursion(eventInfo);
        excursion.setStart(startDate);
        excursion.setFinish(getFinish(startDate, finishDiff));
        return excursion;
    }
}
