package com.java.automation.lab.fall.antonyuk.core22.domain.horse;

import com.java.automation.lab.fall.antonyuk.core22.domain.Specialization;
import com.java.automation.lab.fall.antonyuk.core22.domain.ammunition.Ammunition;
import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;

import javax.naming.InvalidNameException;
import java.util.Date;
import java.util.Objects;

public class HorseInfo {
    private String name;
    private Date wasBorn;
    private Specialization specialization;
    private Pedigree pedigree;
    private Ammunition ammunition;
    private HorseSuit horseSuit;

    public HorseInfo() {
    }

    public HorseInfo(String name, Date wasBorn, Specialization specialization, Pedigree pedigree,
                     Ammunition ammunition, HorseSuit horseSuit) throws InvalidNameException
    {
        this.setName(name);
        this.setWasBorn(wasBorn);
        this.setSpecialization(specialization);
        this.setPedigree(pedigree);
        this.setAmmunition(ammunition);
        this.setHorseSuit(horseSuit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidNameException {
        if (!Validator.isValidName(name)) {
            throw new InvalidNameException();
        }
        this.name = name;
    }

    public Date getWasBorn() {
        return wasBorn;
    }

    public void setWasBorn(Date wasBorn) {
        this.wasBorn = wasBorn;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public HorseInfo setSpecialization(Specialization specialization) {
        this.specialization = specialization;
        return this;
    }

    public Pedigree getPedigree() {
        return pedigree;
    }

    public void setPedigree(Pedigree pedigree) {
        this.pedigree = pedigree;
    }

    public Ammunition getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(Ammunition ammunition) {
        this.ammunition = ammunition;
    }

    public HorseSuit getHorseSuit() {
        return horseSuit;
    }

    public HorseInfo setHorseSuit(HorseSuit horseSuit) {
        this.horseSuit = horseSuit;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HorseInfo horseInfo = (HorseInfo) o;
        return Objects.equals(name, horseInfo.name) &&
                Objects.equals(wasBorn, horseInfo.wasBorn) &&
                specialization == horseInfo.specialization &&
                Objects.equals(pedigree, horseInfo.pedigree) &&
                Objects.equals(ammunition, horseInfo.ammunition) &&
                horseSuit == horseInfo.horseSuit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, wasBorn, specialization, pedigree, ammunition, horseSuit);
    }

    @Override
    public String toString() {
        return "HorseInfo{" +
                "name='" + name + '\'' +
                ", wasBorn=" + wasBorn +
                ", specialization=" + specialization +
                ", pedigree=" + pedigree +
                ", ammunition=" + ammunition +
                ", horseSuit=" + horseSuit +
                '}';
    }
}
