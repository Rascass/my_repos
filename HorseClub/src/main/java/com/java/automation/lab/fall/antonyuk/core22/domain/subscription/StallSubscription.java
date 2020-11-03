package com.java.automation.lab.fall.antonyuk.core22.domain.subscription;

import com.java.automation.lab.fall.antonyuk.core22.domain.building.Stall;

import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class StallSubscription extends Subscription{

    private Stall stall;

    public StallSubscription() {
    }

    public StallSubscription(Stall stall) {
        this.stall = stall;
    }

    public StallSubscription(Date start, Date finish, double startPrice,
                             Map<String, Integer> discounts, Stall stall) {
        super(start, finish, startPrice, discounts);
        this.stall = stall;
    }

    public Stall getStall() {
        return stall;
    }

    public void setStall(Stall stall) {
        this.stall = stall;
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
        StallSubscription that = (StallSubscription) o;
        return Objects.equals(stall, that.stall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stall);
    }

    @Override
    public String toString() {
        return "StallSubscription{" +
                "stall=" + stall +
                '}';
    }
}
