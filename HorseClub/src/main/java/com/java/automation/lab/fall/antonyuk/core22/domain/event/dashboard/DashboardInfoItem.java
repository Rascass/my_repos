package com.java.automation.lab.fall.antonyuk.core22.domain.event.dashboard;

import java.util.Date;
import java.util.Objects;

public class DashboardInfoItem {
    private String eventName;
    private Date start;
    private Date finish;

    public DashboardInfoItem() {
    }

    public DashboardInfoItem(String eventName, Date start, Date finish) {
        this.eventName = eventName;
        this.start = start;
        this.finish = finish;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DashboardInfoItem that = (DashboardInfoItem) o;
        return Objects.equals(eventName, that.eventName) &&
                Objects.equals(start, that.start) &&
                Objects.equals(finish, that.finish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName, start, finish);
    }

    @Override
    public String toString() {
        return "DashboardInfoItem{" +
                ", eventName='" + eventName + '\'' +
                ", start=" + start +
                ", finish=" + finish +
                '}';
    }
}
