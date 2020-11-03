package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Client;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Employee;

import javax.naming.InvalidNameException;
import java.util.*;

public class TrainingGroup extends Event{

    private Employee trainer;
    private Set<Client> pupils;

    public TrainingGroup() {
        pupils = new HashSet<>();
    }

    public TrainingGroup(EventInfo eventInfo, Employee trainer, Set<Client> pupils) {
        super(eventInfo);
        this.trainer = trainer;
        this.pupils = pupils;
    }

    public TrainingGroup(HorseClub horseClub, String name, Date start, Date finish,
                         Employee trainer, Set<Client> pupils) throws InvalidNameException {
        super(horseClub, name, start, finish);
        this.trainer = trainer;
        this.pupils = pupils;
    }

    public Employee getTrainer() {
        return trainer;
    }

    public void setTrainer(Employee trainer) {
        this.trainer = trainer;
    }

    public Set<Client> getPupils() {
        return pupils;
    }

    public void setPupils(Set<Client> pupils) {
        this.pupils = pupils;
    }

    public void addPupil(Client pupil) {
        this.pupils.add(pupil);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        TrainingGroup that = (TrainingGroup) o;
        return Objects.equals(trainer, that.trainer) &&
                Objects.equals(pupils, that.pupils);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), trainer, pupils);
    }

    @Override
    public String toString() {
        return "TrainingGroup{" +
                "trainer=" + trainer +
                ", pupils=" + pupils +
                '}';
    }
}
