package com.java.automation.lab.fall.antonyuk.core22.domain.horse;

import com.java.automation.lab.fall.antonyuk.core22.domain.*;
import com.java.automation.lab.fall.antonyuk.core22.domain.ammunition.Ammunition;
import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Age;
import com.java.automation.lab.fall.antonyuk.core22.domain.exception.NotSpecifiedBirthdayException;

import javax.naming.InvalidNameException;
import java.util.*;

public abstract class Horse{
    private HorseInfo horseInfo;

    public Horse() {
    }

    public Horse(HorseInfo horseInfo) {
        this.horseInfo = horseInfo;
    }

    public Horse(String name, Date wasBorn, Specialization specialization, Pedigree pedigree,
                 Ammunition ammunition, HorseSuit horseSuit) throws InvalidNameException {
        this.horseInfo = new HorseInfo(name, wasBorn, specialization, pedigree, ammunition, horseSuit);
    }

    public String getName() {
        return this.horseInfo.getName();
    }

    public void setName(String name) throws InvalidNameException {
        this.horseInfo.setName(name);
    }

    public Date getWasBorn() {
        return this.horseInfo.getWasBorn();
    }

    public void setWasBorn(Date wasBorn) throws NotSpecifiedBirthdayException {
        if (wasBorn == null) {
            throw new NotSpecifiedBirthdayException();
        }
        this.horseInfo.setWasBorn(wasBorn);
    }

    public Specialization getSpecialization() {
        return this.horseInfo.getSpecialization();
    }

    public Horse setSpecialization(Specialization specialization) {
        this.horseInfo.setSpecialization(specialization);
        return this;
    }

    public Pedigree getPedigree() {
        return this.horseInfo.getPedigree();
    }

    public void setPedigree(Pedigree pedigree) {
        this.horseInfo.setPedigree(pedigree);
    }

    public Horse setHorseSuit(HorseSuit horseSuit) {
        this.horseInfo.setHorseSuit(horseSuit);
        return this;
    }

    public HorseSuit getHorseSuit() {
        return this.horseInfo.getHorseSuit();
    }

    public int getAge() {
        return Age.getAge(getWasBorn());
    }
    public Ammunition getAmmunition() {
        return this.horseInfo.getAmmunition();
    }

    public void setAmmunition(Ammunition ammunition) {
        this.horseInfo.setAmmunition(ammunition);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Horse horse = (Horse) o;
        return Objects.equals(horseInfo, horse.horseInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horseInfo);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "horseInfo=" + horseInfo +
                '}';
    }

    public HorseInfo getHorseInfo() {
        return horseInfo;
    }

    public void setHorseInfo(HorseInfo horseInfo) {
        this.horseInfo = horseInfo;
    }
}
