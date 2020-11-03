package com.java.automation.lab.fall.antonyuk.core22.domain.event.dashboard;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Dashboard {

    private Set<DashboardInfoItem> dashboardInfoItems;
    private HorseClub horseClub;

    public Dashboard() {
        dashboardInfoItems = new HashSet<>();
    }

    public Dashboard(Set<DashboardInfoItem> dashboardInfoItems, HorseClub horseClub) {
        this.horseClub = horseClub;
        this.dashboardInfoItems = dashboardInfoItems;
    }

    public HorseClub getHorseClub() {
        return horseClub;
    }

    public void setHorseClub(HorseClub horseClub) {
        this.horseClub = horseClub;
    }

    public Set<DashboardInfoItem> getDashboardInfo(HorseClub horseClub) {
        return Queries.getDashboardInfo(this.horseClub);
    }

    public Set<DashboardInfoItem> getDashboardCompetition() {
        return Queries.getDashboardCompetition(this.horseClub);
    }

    public Set<DashboardInfoItem> getDashboardExcursion() {
        return Queries.getDashboardExcursion(this.horseClub);
    }

    public Set<DashboardInfoItem> getDashboardInfoItems() {
        return dashboardInfoItems;
    }

    public void setDashboardInfoItems(Set<DashboardInfoItem> dashboardInfoItems) {
        this.dashboardInfoItems = dashboardInfoItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dashboard dashboard = (Dashboard) o;
        return Objects.equals(dashboardInfoItems, dashboard.dashboardInfoItems) &&
                Objects.equals(horseClub, dashboard.horseClub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dashboardInfoItems, horseClub);
    }

    @Override
    public String toString() {
        return "Dashboard{" +
                "dashboardInfoItem=" + dashboardInfoItems +
                ", horseClub=" + horseClub +
                '}';
    }
}
