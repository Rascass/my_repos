package com.java.automation.lab.fall.antonyuk.core22.domain.horse;

import java.util.Objects;

public class Pedigree {

    private Mare mother;
    private Stallion father;

    public Pedigree() {
    }

    public Pedigree(Mare mother, Stallion father) {
        this.mother = mother;
        this.father = father;
    }

    public Pedigree(Mare mother) {
        this.mother = mother;
        this.father = null;
    }

    public Pedigree(Stallion father) {
        this.mother = null;
        this.father = father;
    }

    public Mare getMother() {
        return mother;
    }

    public void setMother(Mare mother) {
        this.mother = mother;
    }

    public Stallion getFather() {
        return father;
    }

    public void setFather(Stallion father) {
        this.father = father;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pedigree pedigree = (Pedigree) o;
        return Objects.equals(mother, pedigree.mother) &&
                Objects.equals(father, pedigree.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father);
    }

    @Override
    public String toString() {
        return "Pedigree{" +
                "mother=" + mother +
                ", father=" + father +
                '}';
    }
}
