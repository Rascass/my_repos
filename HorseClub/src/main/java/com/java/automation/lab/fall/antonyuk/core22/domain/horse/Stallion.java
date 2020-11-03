package com.java.automation.lab.fall.antonyuk.core22.domain.horse;

import com.java.automation.lab.fall.antonyuk.core22.domain.*;
import com.java.automation.lab.fall.antonyuk.core22.domain.ammunition.Ammunition;
import com.java.automation.lab.fall.antonyuk.core22.domain.building.Stall;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Client;

import javax.naming.InvalidNameException;
import java.util.Date;
import java.util.Objects;

public class Stallion extends Horse {

    private boolean isGelding;

    public Stallion() {
    }

    public Stallion(HorseInfo horseInfo) {
        super(horseInfo);
    }

    public Stallion(boolean isGelding) {
        this.isGelding = isGelding;
    }

    public Stallion(String name, Date birthday, Stall stall, Client client,
                    Specialization specialization, Pedigree pedigree, Ammunition ammunition, HorseSuit horseSuit,
                    boolean isGelding) throws InvalidNameException {
        super(name, birthday, specialization, pedigree, ammunition, horseSuit);
        this.isGelding = isGelding;
    }

    public Stallion(HorseInfo horseInfo, boolean isGelding) {
        super(horseInfo);
        this.isGelding = isGelding;
    }

    public boolean isGelding() {
        return isGelding;
    }

    public void setGelding(boolean gelding) {
        isGelding = gelding;
    }

    public void makeFoal(Mare mare) {
        mare.makePregnant();
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
        Stallion stallion = (Stallion) o;
        return isGelding == stallion.isGelding;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isGelding);
    }

    @Override
    public String toString() {
        return "Stallion{" +
                "horseInfo=" + getHorseInfo() +
                ", isGelding=" + isGelding +
                '}';
    }
}
