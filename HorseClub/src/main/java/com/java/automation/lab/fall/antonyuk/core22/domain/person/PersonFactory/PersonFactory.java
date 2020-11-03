package com.java.automation.lab.fall.antonyuk.core22.domain.person.PersonFactory;

import com.java.automation.lab.fall.antonyuk.core22.domain.person.*;

public class PersonFactory {

    private PersonFactory() {}

    public static Person createPerson(PersonType personType, PersonInfo personInfo) {
        if (personType == PersonType.CLIENT) {
            return new Client(personInfo);
        }
        if (personType == PersonType.EMPLOYEE) {
            return new Employee(personInfo);
        }
        return new Rider(personInfo);
    }
}
