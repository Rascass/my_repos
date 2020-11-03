package com.java.automation.lab.fall.antonyuk.core22.domain.person;
import java.text.NumberFormat;
import java.util.Locale;

public enum Category {
    MASTER("master", "мастер спорта"),
    CANDIDATE("candidate", "кандидат в мастера спорта"),
    THIRD("third", "3 разряд"),
    SECOND("second", "2 раздряд"),
    FIRST("first", "1 разряд"),
    WITHOUT("without", "б/р");

    private String categoryNameEnglish;
    private String categoryNameRussian;

    Category(String categoryNameEnglish, String categoryNameRussian) {
        this.categoryNameEnglish = categoryNameEnglish;
        this.categoryNameRussian = categoryNameRussian;
    }

    public String getCategoryNameEnglish() {
        return categoryNameEnglish;
    }

    public String getCategoryNameRussian() {
        return categoryNameRussian;
    }
}
