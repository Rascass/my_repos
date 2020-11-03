package com.java.automation.lab.fall.antonyuk.core22.domain.exception;

public class EmptyTypeException extends Exception{

    public EmptyTypeException() {
        super("Type was not specified!");
    }
}
