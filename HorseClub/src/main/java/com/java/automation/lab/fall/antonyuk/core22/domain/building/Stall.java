package com.java.automation.lab.fall.antonyuk.core22.domain.building;

import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;

import java.util.Objects;

public class Stall {

    private int number;
    private int square;
    private int price;
    private boolean isFree;

    public Stall() {
    }

    public Stall(int number, int square, int price, boolean isFree) {
        this.setNumber(number);
        this.setSquare(square);
        this.setPrice(price);
        this.setFree(isFree);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        checkNumber(number);
        if (number == 0) {
            throw new IllegalArgumentException();
        }
        this.number = number;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        checkNumber(square);
        this.square = square;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        checkNumber(price);
        this.price = price;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public void checkNumber(int number) {
        if (!Validator.isValidNumber(number)) {
            throw new IllegalArgumentException();
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
        Stall stall = (Stall) o;
        return number == stall.number &&
                square == stall.square &&
                price == stall.price &&
                isFree == stall.isFree;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, square, price, isFree);
    }

    @Override
    public String toString() {
        return "Stall{" +
                "number=" + number +
                ", square=" + square +
                ", price=" + price +
                ", isFree=" + isFree +
                '}';
    }
}
