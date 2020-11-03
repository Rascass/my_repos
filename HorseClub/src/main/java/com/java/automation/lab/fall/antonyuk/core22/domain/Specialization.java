package com.java.automation.lab.fall.antonyuk.core22.domain;

public enum Specialization {
        DRESSAGE("dressage", "выездка"),
        JUMPING("jumping", "конкур"),
        EVENTING("eventing", "троеборье"),
        HOBBY("hobby", "хобби");

        private String specializationNameEnglish;
        private String specializationNameRussian;

        Specialization(String specializationNameEnglish, String specializationNameRussian) {
                this.specializationNameEnglish = specializationNameEnglish;
                this.specializationNameRussian = specializationNameRussian;
        }

        public String getSpecializationNameEnglish() {
                return this.specializationNameEnglish;
        }

        public String getSpecializationNameRussian() {
                return this.specializationNameRussian;
        }
}
