package com.java.automation.lab.fall.antonyuk.core22.domain.exception;

public class EmptyAmmunitionStateException extends Exception{

    public EmptyAmmunitionStateException() {
        super("State of ammunition is null!");
    }
}
