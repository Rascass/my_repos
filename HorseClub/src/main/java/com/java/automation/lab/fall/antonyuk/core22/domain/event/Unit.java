package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.domain.horse.TypeHorse;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.horseFactory.HorseFactory;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Horse;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.HorseInfo;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.PersonFactory.PersonFactory;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.PersonInfo;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.PersonType;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Rider;

import java.util.Objects;

public class Unit {

    private Horse horse;
    private Rider rider;

    public Unit() {
    }

    public Unit(Horse horse, Rider rider) {
        this.horse = horse;
        this.rider = rider;
    }

    public Unit(HorseInfo horseInfo, TypeHorse typeHorse, PersonInfo personInfo) {
        this.horse = HorseFactory.createHorse(horseInfo, typeHorse);
        this.rider = (Rider) PersonFactory.createPerson(PersonType.RIDER, personInfo);
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Unit unit = (Unit) o;
        return Objects.equals(horse, unit.horse) &&
                Objects.equals(rider, unit.rider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horse, rider);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "horse=" + horse +
                ", rider=" + rider +
                '}';
    }
}
