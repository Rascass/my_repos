package com.java.automation.lab.fall.antonyuk.core22.domain.ammunition;

import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;
import com.java.automation.lab.fall.antonyuk.core22.domain.exception.EmptyAmmunitionStateException;

import java.util.Objects;

public class Ammunition {

    private Bridle bridle;
    private Saddle saddle;
    private boolean isClean = true;
    private int numbersUsing = 0;
    private State state = State.GOOD;

    public Ammunition() {
    }

    public Ammunition(Bridle bridle, Saddle saddle) {
        this.bridle = bridle;
        this.saddle = saddle;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) throws EmptyAmmunitionStateException {
        if (state == null) {
            throw new EmptyAmmunitionStateException();
        }
        this.state = state;
    }

    public boolean getIsClean() {
        return isClean;
    }

    public void setIsClean(boolean clean) {
        isClean = clean;
    }

    public Bridle getBridle() {
        return bridle;
    }

    public void setBridle(Bridle bridle) {
        this.bridle = bridle;
    }

    public Saddle getSaddle() {
        return saddle;
    }

    public void setSaddle(Saddle saddle) {
        this.saddle = saddle;
    }

    public void dressUp() {
        isClean = false;
        if (numbersUsing > 1000) {
            state = State.BAD;
        } else if (numbersUsing > 500) {
            state = State.NORMAL;
        }
        numbersUsing++;
    }

    public int getNumbersUsing() {
        return numbersUsing;
    }

    public void setNumbersUsing(int numbersUsing) throws IllegalArgumentException {
        if (!Validator.isValidNumber(numbersUsing)) {
            throw new IllegalArgumentException();
        }
        this.numbersUsing = numbersUsing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ammunition that = (Ammunition) o;
        return Objects.equals(bridle, that.bridle) &&
                Objects.equals(saddle, that.saddle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bridle, saddle);
    }

    @Override
    public String toString() {
        return "Ammunition{" +
                "bridle=" + bridle +
                ", saddle=" + saddle +
                '}';
    }
}
