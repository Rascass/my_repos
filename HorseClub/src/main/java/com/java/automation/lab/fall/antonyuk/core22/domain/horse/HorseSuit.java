package com.java.automation.lab.fall.antonyuk.core22.domain.horse;

public enum HorseSuit {
    BLACK("black", "вороная"),
    CHESTNUT("chestnut", "рыжая"),
    GRAY("gray", "серая"),
    PALOMINO("palomino", "соловая"),
    BROWN("brown", "гнедая");

    private String colorNameEnglish;
    private String colorNameRussian;

    HorseSuit(String colorNameEnglish, String colorNameRussian) {
        this.colorNameEnglish = colorNameEnglish;
        this.colorNameRussian = colorNameRussian;
    }

    public String getColorNameEnglish() {
        return this.colorNameEnglish;
    }

    public String getColorNameRussian() {
        return this.colorNameRussian;
    }
}