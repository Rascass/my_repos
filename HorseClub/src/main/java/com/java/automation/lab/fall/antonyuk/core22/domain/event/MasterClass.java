package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Rider;
import com.java.automation.lab.fall.antonyuk.core22.domain.Specialization;

import javax.naming.InvalidNameException;
import java.util.*;

public class MasterClass extends UnitsEvent {

    private Rider mentor;
    private int price;

    public MasterClass(EventInfo eventInfo) {
        super(eventInfo);
    }
    public MasterClass(Rider mentor, int price) {
        this.mentor = mentor;
        this.price = price;
    }

    public MasterClass(EventInfo eventInfo, Rider mentor, int price) {
        super(eventInfo);
        this.mentor = mentor;
        this.price = price;
    }

    public MasterClass(Set<Unit> participants, Specialization specialization, Rider mentor, int price) {
        super(participants, specialization);
        this.mentor = mentor;
        this.price = price;
    }

    public MasterClass(EventInfo eventInfo, Set<Unit> participants, Specialization specialization,
                       Rider mentor, int price) {
        super(eventInfo, participants, specialization);
        this.mentor = mentor;
        this.price = price;
    }

    public MasterClass(HorseClub horseClub, String name, Date start, Date finish, Rider mentor,
                       int price) throws InvalidNameException {
        super(horseClub, name, start, finish);
        this.mentor = mentor;
        this.price = price;
    }

    public MasterClass(HorseClub horseClub, String name, Date start, Date finish, Set<Unit> participants,
                       Specialization specialization, Rider mentor, int price) throws InvalidNameException {
        super(horseClub, name, start, finish, participants, specialization);
        this.mentor = mentor;
        this.price = price;
    }

    public Rider getMentor() {
        return mentor;
    }

    public void setMentor(Rider mentor) {
        this.mentor = mentor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 1) {
            throw new IllegalArgumentException();
        }
        this.price = price;
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
        MasterClass that = (MasterClass) o;
        return price == that.price &&
                Objects.equals(mentor, that.mentor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mentor, price);
    }

    @Override
    public String toString() {
        return "MasterClass{" +
                "mentor=" + mentor +
                ", price=" + price +
                '}';
    }
}
