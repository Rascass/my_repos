package com.java.automation.lab.fall.antonyuk.core22.domain.person;

import javax.naming.InvalidNameException;
import java.sql.Date;
import java.util.Objects;

public class Rider extends Person{

    private Category category;

    public Rider() {
    }

    public Rider(Category category) {
        this.category = category;
    }

    public Rider(PersonInfo personInfo, Category category) {
        super(personInfo);
        this.category = category;
    }

    public Rider(PersonInfo personInfo) {
        super(personInfo);
    }

    public Rider(String firstName, String secondName, String lastName, Date birthday, Gender gender,
                 Category category) throws InvalidNameException {
        super(firstName, secondName, lastName, birthday, gender);
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
        Rider rider = (Rider) o;
        return category == rider.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(category);
    }

    @Override
    public String toString() {
        return "Rider{" +
                "personInfo=" + getPersonInfo() +
                ", category=" + category +
                '}';
    }
}
