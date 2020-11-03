package com.java.automation.lab.fall.antonyuk.core22.domain.horse.horseFactory;

import com.java.automation.lab.fall.antonyuk.core22.domain.Specialization;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.*;

 class JumpingHorseFactory {

     private JumpingHorseFactory(){}
     public static Horse createHorse(HorseInfo horseInfo, TypeHorse typeHorse, HorseSuit horseSuit) {
         return HorseFactory.createHorse(horseInfo, typeHorse)
                .setSpecialization(Specialization.JUMPING)
                .setHorseSuit(horseSuit);
    }
}
