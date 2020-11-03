package com.java.automation.lab.fall.antonyuk.core22.domain.horse.horseFactory;

import com.java.automation.lab.fall.antonyuk.core22.domain.Specialization;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Horse;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.HorseInfo;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.HorseSuit;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.TypeHorse;

public class SportHorseFactory {
    public static Horse createHorse(HorseInfo horseInfo, TypeHorse typeHorse,
                                    HorseSuit horseSuit, Specialization specialization) {
        if (specialization == Specialization.DRESSAGE) {
            return DressageHorseFactory.createHorse(horseInfo, typeHorse, horseSuit);
        } else if (specialization == Specialization.JUMPING) {
            return JumpingHorseFactory.createHorse(horseInfo, typeHorse, horseSuit);
        } else if (specialization == Specialization.EVENTING) {
            return EventingHorseFactory.createHorse(horseInfo, typeHorse, horseSuit);
        }
        return null;
    }
}
