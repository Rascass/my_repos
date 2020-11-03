package com.java.automation.lab.fall.antonyuk.core22.domain.club;

import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;

import javax.naming.InvalidNameException;
import java.util.Objects;

public class Address {

    private String town;
    private String region;
    private String street;
    private int number;

    public Address() {
    }

    public Address(String town, String region, String street, int number) throws InvalidNameException {
        this.setNumber(number);
        this.setRegion(region);
        this.setStreet(street);
        this.setTown(town);
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) throws InvalidNameException {
        if (!Validator.isValidName(town)) {
            throw new InvalidNameException();
        }
        this.town = town;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) throws InvalidNameException {
        if (!Validator.isValidName(region)) {
            throw new InvalidNameException();
        }
        this.region = region;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) throws InvalidNameException {
        if (!Validator.isValidName(street)) {
            throw new InvalidNameException();
        }
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number < 1) {
            throw new IllegalArgumentException();
        }
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return Objects.equals(town, address.town) &&
                Objects.equals(region, address.region) &&
                Objects.equals(street, address.street) &&
                Objects.equals(number, address.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(town, region, street, number);
    }

    @Override
    public String toString() {
        return "Address{" +
                "town='" + town + '\'' +
                ", region='" + region + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
