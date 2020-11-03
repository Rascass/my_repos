package com.java.automation.lab.fall.antonyuk.core22.domain.horse.horseFactory;

import com.java.automation.lab.fall.antonyuk.core22.domain.horse.*;

public class HorseFactory {

    private HorseFactory(){}
    public static Horse createHorse(HorseInfo horseInfo, TypeHorse typeHorse) {
        if (typeHorse == TypeHorse.MARE) {
            return new Mare(horseInfo);
        }
        if (typeHorse == TypeHorse.GELDING) {
            return new Stallion(true);
        }
        return new Stallion(false);
    }
}
