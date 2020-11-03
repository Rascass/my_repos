package com.java.automation.lab.fall.antonyuk.core22.domain.person;

public enum Position {
    TRAINER("trainer", "тренер"),
    GROOM("groom", "конюх"),
    VETERINAR("veterinar", "ветеринар");

    private String positionNameEnglish;
    private String positionNameRussian;

    Position(String positionNameEnglish, String positionNameRussian) {
        this.positionNameEnglish = positionNameEnglish;
        this.positionNameRussian = positionNameRussian;
    }
}
