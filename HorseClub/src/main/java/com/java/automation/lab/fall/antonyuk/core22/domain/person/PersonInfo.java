package com.java.automation.lab.fall.antonyuk.core22.domain.person;

import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;

import javax.naming.InvalidNameException;
import java.util.Date;
import java.util.Objects;

public class PersonInfo {

    private String firstName;
    private String secondName;
    private String lastName;
    private Date birthday;
    private Gender gender;

    public PersonInfo() {
    }

    public PersonInfo(String firstName, String secondName, String lastName, Date birthday,
                      Gender gender) throws InvalidNameException {
        this.setFirstName(firstName);
        this.setSecondName(secondName);
        this.setLastName(lastName);
        this.setBirthday(birthday);
        this.setGender(gender);
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws InvalidNameException {
        checkName(firstName);
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) throws InvalidNameException {
        checkName(secondName);
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws InvalidNameException {
        checkName(lastName);
        this.lastName = lastName;
    }

    private void checkName(String name) throws InvalidNameException {
        if (!Validator.isValidName(name)) {
            throw new InvalidNameException();
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
        PersonInfo personInfo = (PersonInfo) o;
        return Objects.equals(firstName, personInfo.firstName) &&
                Objects.equals(secondName, personInfo.secondName) &&
                Objects.equals(lastName, personInfo.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, lastName);
    }

    @Override
    public String toString() {
        return "FullName{" +
                "name='" + firstName + '\'' +
                ", surname='" + secondName + '\'' +
                ", patronymic='" + lastName + '\'' +
                '}';
    }
}
