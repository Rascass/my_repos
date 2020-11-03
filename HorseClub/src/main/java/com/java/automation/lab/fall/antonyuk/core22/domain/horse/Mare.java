package com.java.automation.lab.fall.antonyuk.core22.domain.horse;

import com.java.automation.lab.fall.antonyuk.core22.domain.*;
import com.java.automation.lab.fall.antonyuk.core22.domain.ammunition.Ammunition;

import javax.naming.InvalidNameException;
import java.util.Date;
import java.util.Objects;

public class Mare extends Horse {

    private boolean isCanBePregnant;
    private boolean isPregnant;

    public Mare() {
    }

    public Mare(HorseInfo horseInfo) {
        super(horseInfo);
    }

    public Mare(boolean isCanBePregnant) {
        this.isCanBePregnant = isCanBePregnant;
    }

    public Mare(String name, Date birthday, Specialization specialization, Pedigree pedigree,
                Ammunition ammunition, HorseSuit horseSuit, boolean isCanBePregnant) throws InvalidNameException {
        super(name, birthday, specialization, pedigree, ammunition, horseSuit);
        this.isCanBePregnant = isCanBePregnant;
    }

    public Mare(HorseInfo horseInfo, boolean isCanBePregnant, boolean isPregnant) {
        super(horseInfo);
        this.isCanBePregnant = isCanBePregnant;
        this.isPregnant = isPregnant;
    }

    public boolean isCanBePregnant() {
        return isCanBePregnant;
    }

    public boolean isPregnant() {
        return isPregnant;
    }

    public void setCanBePregnant(boolean canBePregnant) {
        isCanBePregnant = canBePregnant;
    }

    public void makePregnant() {
        this.isPregnant = true;
        if (!this.isCanBePregnant) {
            this.isCanBePregnant = true;
        }
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
        Mare mare = (Mare) o;
        return isCanBePregnant == mare.isCanBePregnant &&
                isPregnant == mare.isPregnant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isCanBePregnant, isPregnant);
    }

    @Override
    public String toString() {
        return "Mare{" +
                "horseInfo=" + getHorseInfo() +
                ", isCanBePregnant=" + isCanBePregnant +
                ", isPregnant=" + isPregnant +
                '}';
    }
}
