package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;

import java.util.Date;
import java.util.Objects;

public class EventInfo {

    private HorseClub horseClub;
    private String name;
    private Date start;
    private Date finish;

    public EventInfo() {
    }

    public EventInfo(HorseClub horseClub, String name, Date start, Date finish) {
        this.horseClub = horseClub;
        this.name = name;
        this.start = start;
        this.finish = finish;
    }

    public HorseClub getHorseClub() {
        return horseClub;
    }

    public void setHorseClub(HorseClub horseClub) {
        this.horseClub = horseClub;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        EventInfo eventInfo = (EventInfo) o;
        return Objects.equals(horseClub, eventInfo.horseClub) &&
                Objects.equals(name, eventInfo.name) &&
                Objects.equals(start, eventInfo.start) &&
                Objects.equals(finish, eventInfo.finish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horseClub, name, start, finish);
    }

    @Override
    public String toString() {
        return "EventInfo{" +
                "horseClub=" + horseClub +
                ", name='" + name + '\'' +
                ", start=" + start +
                ", finish=" + finish +
                '}';
    }
}
