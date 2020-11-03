package com.java.automation.lab.fall.antonyuk.core22.domain.building;

import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;

import java.util.Objects;

public class RidingHall {

    private int width;
    private int length;
    private int horsesCapacity;

    public RidingHall() {
    }

    public RidingHall(int width, int length, int horsesCapacity) {
        this.setWidth(width);
        this.setLength(length);
        this.setHorsesCapacity(horsesCapacity);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException();
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException();
        }
        this.length = length;
    }

    public int getHorsesCapacity() {
        return horsesCapacity;
    }

    public void setHorsesCapacity(int horsesCapacity) {
        checkNumber(horsesCapacity);
        if (horsesCapacity <= 0) {
            throw new IllegalArgumentException();
        }
        this.horsesCapacity = horsesCapacity;
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
        RidingHall that = (RidingHall) o;
        return Double.compare(that.width, width) == 0 &&
                Double.compare(that.length, length) == 0 &&
                horsesCapacity == that.horsesCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, horsesCapacity);
    }

    @Override
    public String toString() {
        return "RidingHall{" +
                "width=" + width +
                ", length=" + length +
                ", horsesCapacity=" + horsesCapacity +
                '}';
    }
}
