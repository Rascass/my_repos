package com.java.automation.lab.fall.antonyuk.core22.domain.event.dashboard;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.Competition;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.Event;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.Excursion;

import java.util.LinkedHashSet;
import java.util.Set;

class Queries {

    private Queries() {}

    public static Set<DashboardInfoItem> getDashboardEventFilter(HorseClub horseClub, Event event, String eventName) {

        Set<Event> events = horseClub.getEvents();
        Set<DashboardInfoItem> dashboardInfoItems = new LinkedHashSet<>();
        for (Event e: events) {
            if (e.getClass() != event.getClass()) {
                continue;
            }
            dashboardInfoItems.add(new DashboardInfoItem(eventName, e.getStart(), e.getFinish()));
        }
        return dashboardInfoItems;
    }

    public static Set<DashboardInfoItem> getDashboardInfo(HorseClub horseClub) {
        Set<Event> events = horseClub.getEvents();
        Set<DashboardInfoItem> dashboardInfoItems = new LinkedHashSet<>();
        for (Event event: events) {
            String eventName = "excursion";
            if (event.getClass() == new Competition().getClass()) {
                eventName = "competition";
            }
            dashboardInfoItems.add(new DashboardInfoItem(eventName, event.getStart(), event.getFinish()));
        }
        return dashboardInfoItems;
    }

    public static Set<DashboardInfoItem> getDashboardCompetition(HorseClub horseClub) {
        return getDashboardEventFilter(horseClub, new Competition(), "competition");
    }

    public static Set<DashboardInfoItem> getDashboardExcursion(HorseClub horseClub) {
        return getDashboardEventFilter(horseClub, new Excursion(), "excursion");
    }
}
