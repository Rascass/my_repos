package com.java.automation.lab.fall.antonyuk.core22.domain.exception;

public class NotSpecifiedBirthdayException extends Exception{

    public NotSpecifiedBirthdayException() {
        super("Date of birth was not specified!");
    }
}
