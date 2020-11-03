package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.domain.Specialization;
import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;
import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;

import javax.naming.InvalidNameException;
import java.util.*;

public class Competition extends UnitsEvent {

    private int sumPrize;
    private Unit winner;

    public Competition() {}

    public Competition(EventInfo eventInfo) {
        super(eventInfo);
    }

    public Competition(int sumPrize, Unit winner) {
        this.sumPrize = sumPrize;
        this.winner = winner;
    }

    public Competition(EventInfo eventInfo, int sumPrize, Unit winner) {
        super(eventInfo);
        this.sumPrize = sumPrize;
        this.winner = winner;
    }

    public Competition(Set<Unit> participants, Specialization specialization, int sumPrize, Unit winner) {
        super(participants, specialization);
        this.sumPrize = sumPrize;
        this.winner = winner;
    }

    public Competition(EventInfo eventInfo, Set<Unit> participants, Specialization specialization,
                       int sumPrize, Unit winner) {
        super(eventInfo, participants, specialization);
        this.sumPrize = sumPrize;
        this.winner = winner;
    }

    public Competition(HorseClub horseClub, String name, Date start, Date finish, int sumPrize,
                       Unit winner) throws InvalidNameException {
        super(horseClub, name, start, finish);
        this.sumPrize = sumPrize;
        this.winner = winner;
    }

    public Competition(HorseClub horseClub, String name, Date start, Date finish, Set<Unit> participants,
                       Specialization specialization, int sumPrize, Unit winner) throws InvalidNameException {
        super(horseClub, name, start, finish, participants, specialization);
        this.sumPrize = sumPrize;
        this.winner = winner;
    }

    public int getSumPrize() {
        return sumPrize;
    }

    public void setSumPrize(int sumPrize) {
        if (!Validator.isValidNumber(sumPrize)) {
            throw new IllegalArgumentException();
        }
        this.sumPrize = sumPrize;
    }

    public Unit getWinner() {
        return winner;
    }

    public void setWinner(Unit winner) {
        this.winner = winner;
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
        Competition that = (Competition) o;
        return sumPrize == that.sumPrize &&
                Objects.equals(winner, that.winner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sumPrize, winner);
    }

    @Override
    public String toString() {
        return "Competition{" +
                "sumPrize=" + sumPrize +
                ", winner=" + winner +
                '}';
    }
}
