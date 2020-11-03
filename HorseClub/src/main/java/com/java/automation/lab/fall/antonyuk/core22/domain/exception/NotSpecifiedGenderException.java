package com.java.automation.lab.fall.antonyuk.core22.domain.exception;

public class NotSpecifiedGenderException extends Exception{

    public NotSpecifiedGenderException() {
        super("Person's gender was not specified!");
    }
}
