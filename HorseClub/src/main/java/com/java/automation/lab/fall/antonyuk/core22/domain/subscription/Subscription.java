package com.java.automation.lab.fall.antonyuk.core22.domain.subscription;

import javax.naming.InvalidNameException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Subscription {

    private Date start;
    private Date finish;
    private double price;
    private double startPrice;
    private Map<String, Integer> discounts;

    public Subscription() {
        discounts = new HashMap<>();
    }

    public Subscription(Date start, Date finish, double startPrice, Map<String, Integer> discounts) {
        this.start = start;
        this.finish = finish;
        this.startPrice = startPrice;
        this.discounts = discounts;
        this.setPrice();
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        if (discounts.size() < 1) {
            this.price = startPrice;
        } else {
            int percent = discounts.values().stream().mapToInt(element -> element).sum();
            this.price = startPrice + startPrice * (percent / 100);
        }
    }

    public Map<String, Integer> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Map<String, Integer> discounts) {
        this.discounts = discounts;
    }

    public double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(double startPrice) {
        this.startPrice = startPrice;
    }

    public void addDiscount(String name, int percent) throws InvalidNameException {
        if (percent < 1) {
            throw new IllegalArgumentException();
        }
        if (name.length() < 1) {
            throw new InvalidNameException();
        }
        discounts.put(name, percent);
        setPrice();
    }

    public void deleteDiscount(String name) {
        discounts.remove(name);
        setPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Subscription that = (Subscription) o;
        return Double.compare(that.price, price) == 0 &&
                Double.compare(that.startPrice, startPrice) == 0 &&
                Objects.equals(start, that.start) &&
                Objects.equals(finish, that.finish) &&
                Objects.equals(discounts, that.discounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, finish, price, startPrice, discounts);
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "start=" + start +
                ", finish=" + finish +
                ", price=" + price +
                ", startPrice=" + startPrice +
                ", discounts=" + discounts +
                '}';
    }
}
