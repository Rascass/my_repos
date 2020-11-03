package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.domain.Specialization;
import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;

import javax.naming.InvalidNameException;
import java.util.*;

public class UnitsEvent extends Event{

    private Set<Unit> participants;
    private Specialization specialization;

    public UnitsEvent() {
        participants = new HashSet<>();
    }

    public UnitsEvent(EventInfo eventInfo) {
        super(eventInfo);
        participants = new HashSet<>();
    }

    public UnitsEvent(Set<Unit> participants, Specialization specialization) {
        this.participants = participants;
        this.specialization = specialization;
    }

    public UnitsEvent(EventInfo eventInfo, Set<Unit> participants, Specialization specialization) {
        super(eventInfo);
        this.participants = participants;
        this.specialization = specialization;
    }

    public UnitsEvent(HorseClub horseClub, String name, Date start, Date finish) throws InvalidNameException {
        super(horseClub, name, start, finish);
        participants = new HashSet<>();
    }

    public UnitsEvent(HorseClub horseClub, String name, Date start, Date finish, Set<Unit> participants,
                      Specialization specialization) throws InvalidNameException {
        super(horseClub, name, start, finish);
        this.participants = participants;
        this.specialization = specialization;
    }

    public void addParticipants(Unit unit) {
        participants.add(unit);
    }

    public Set<Unit> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<Unit> participants) {
        this.participants = participants;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        UnitsEvent that = (UnitsEvent) o;
        return Objects.equals(participants, that.participants) &&
                specialization == that.specialization;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), participants, specialization);
    }

    @Override
    public String toString() {
        return "UnitsEvent{" +
                "participants=" + participants +
                ", specialization=" + specialization +
                '}';
    }
}
