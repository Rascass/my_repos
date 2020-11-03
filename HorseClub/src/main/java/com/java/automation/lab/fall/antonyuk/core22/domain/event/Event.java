package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;
import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;

import javax.naming.InvalidNameException;
import java.util.Date;
import java.util.Objects;

public abstract class Event {

    private EventInfo eventInfo;

    public Event() {
    }

    public Event(EventInfo eventInfo) {
        this.eventInfo = eventInfo;
    }

    public Event(HorseClub horseClub, String name, Date start, Date finish) throws InvalidNameException {
        this.eventInfo = new EventInfo(horseClub, name, start, finish);
    }

    public HorseClub getHorseClub() {
        return eventInfo.getHorseClub();
    }

    public void setHorseClub(HorseClub horseClub) {
        this.eventInfo.setHorseClub(horseClub);
    }

    public String getName() {
        return eventInfo.getName();
    }

    public void setName(String name) throws InvalidNameException {
        if (!Validator.isValidName(name)) {
            throw new InvalidNameException();
        }
        this.eventInfo.setName(name);
    }

    public Date getStart() {
        return eventInfo.getStart();
    }

    public void setStart(Date start) {
        this.eventInfo.setStart(start);
    }

    public Date getFinish() {
        return eventInfo.getFinish();
    }

    public void setFinish(Date finish) {
        this.setFinish(finish);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Event event = (Event) o;
        return Objects.equals(eventInfo, event.eventInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventInfo);
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventInfo=" + eventInfo +
                '}';
    }
}
