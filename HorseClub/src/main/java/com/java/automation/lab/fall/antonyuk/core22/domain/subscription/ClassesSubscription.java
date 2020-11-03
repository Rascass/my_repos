package com.java.automation.lab.fall.antonyuk.core22.domain.subscription;

import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class ClassesSubscription extends Subscription{

    private int numberClasses;

    public ClassesSubscription() {}

    public ClassesSubscription(int numberClasses) {
        this.numberClasses = numberClasses;
    }

    public ClassesSubscription(Date start, Date finish, double startPrice,
                               Map<String, Integer> discounts, int numberClasses) {
        super(start, finish, startPrice, discounts);
        this.numberClasses = numberClasses;
    }

    public int getNumberClasses() {
        return numberClasses;
    }

    public void setNumberClasses(int numberClasses) {
        this.numberClasses = numberClasses;
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
        ClassesSubscription that = (ClassesSubscription) o;
        return numberClasses == that.numberClasses;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberClasses);
    }

    @Override
    public String toString() {
        return "ClassesSubscription{" +
                "numberClasses=" + numberClasses +
                '}';
    }
}
