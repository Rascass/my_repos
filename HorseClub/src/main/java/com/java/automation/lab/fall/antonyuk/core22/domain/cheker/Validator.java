package com.java.automation.lab.fall.antonyuk.core22.domain.cheker;

import com.java.automation.lab.fall.antonyuk.core22.domain.constant.FileConstant;

import java.nio.file.Path;

public final class Validator {

    private Validator() {}

    public static boolean isValidName (String name) {
        String regex = "[A-Z[a-z][а-я][А-Я]]+";
        return name.matches(regex);
    }

    public static boolean isValidNumber (int number) {
        return number >= 0;
    }

    public static boolean isValidFileName(Path filePath) {
        String csvRegex = FileConstant.CSV_REGEX;
        return filePath.toString().matches(csvRegex);
    }
}
