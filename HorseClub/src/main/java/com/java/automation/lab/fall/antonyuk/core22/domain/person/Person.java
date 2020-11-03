package com.java.automation.lab.fall.antonyuk.core22.domain.person;

import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Age;
import com.java.automation.lab.fall.antonyuk.core22.domain.exception.NotSpecifiedBirthdayException;
import com.java.automation.lab.fall.antonyuk.core22.domain.exception.NotSpecifiedGenderException;

import javax.naming.InvalidNameException;
import java.util.Date;
import java.util.Objects;

public abstract class Person {

    private PersonInfo personInfo;

    public Person() {
    }

    public Person(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }

    public Person(String firstName, String secondName, String lastName, Date birthday, Gender gender) throws InvalidNameException {
        this.personInfo = new PersonInfo(firstName, secondName, lastName, birthday, gender);
    }

    public int getAge() {
        return Age.getAge(this.personInfo.getBirthday());
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }

    public Gender getGender() {
        return this.personInfo.getGender();
    }

    public void setGender(Gender gender) throws NotSpecifiedGenderException {
        if (gender == null) {
            throw new NotSpecifiedGenderException();
        }
        this.personInfo.setGender(gender);
    }

    public Date getBirthday() {
        return personInfo.getBirthday();
    }

    public void setBirthday(Date birthday) throws NotSpecifiedBirthdayException {
        if (birthday == null) {
            throw new NotSpecifiedBirthdayException();
        }
        this.personInfo.setBirthday(birthday);
    }

    public String getFirstName() {
        return personInfo.getFirstName();
    }

    public void setFirstName(String firstName) throws InvalidNameException {
        this.personInfo.setFirstName(firstName);
    }

    public String getSecondName() {
        return this.personInfo.getSecondName();
    }

    public void setSecondName(String secondName) throws InvalidNameException {
        this.personInfo.setSecondName(secondName);
    }

    public String getLastName() {
        return this.personInfo.getLastName();
    }

    public void setLastName(String lastName) throws InvalidNameException {
        this.personInfo.setLastName(lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(personInfo, person.personInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personInfo);
    }

    @Override
    public String toString() {
        return "Person{" +
                "personInfo=" + personInfo +
                '}';
    }
}
