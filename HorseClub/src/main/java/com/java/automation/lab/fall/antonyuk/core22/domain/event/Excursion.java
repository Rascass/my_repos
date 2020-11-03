package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Client;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Employee;
import com.java.automation.lab.fall.antonyuk.core22.domain.club.HorseClub;

import javax.naming.InvalidNameException;
import java.util.*;

public class Excursion extends Event {

    private Employee guide;
    private double price;
    private int maxPeopleCount;
    private Set<Client> clients;

    public Excursion() {
        clients = new HashSet<>();
    }

    public Excursion(EventInfo eventInfo, Employee guide, double price, int maxPeopleCount, Set<Client> clients) {
        super(eventInfo);
        this.guide = guide;
        this.setPrice(price);
        this.setMaxPeopleCount(maxPeopleCount);
        if (clients.size() < maxPeopleCount) {
            this.clients = clients;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Excursion(EventInfo eventInfo) {
        super(eventInfo);
        clients = new HashSet<>();
    }

    public Excursion(HorseClub horseClub, String name, Date start, Date finish, Employee guide, double price,
                     int maxPeopleCount, Set<Client> clients) throws InvalidNameException {
        super(horseClub, name, start, finish);
        this.guide = guide;
        this.setPrice(price);
        this.setMaxPeopleCount(maxPeopleCount);
        if (clients.size() < maxPeopleCount) {
            this.clients = clients;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Employee getGuide() {
        return guide;
    }

    public Excursion setGuide(Employee guide) {
        this.guide = guide;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Excursion setPrice(double price) {
        if (!Validator.isValidNumber((int) price)) {
            throw new IllegalArgumentException();
        }
        this.price = price;
        return this;
    }

    public int getMaxPeopleCount() {
        return maxPeopleCount;
    }

    public Excursion setMaxPeopleCount(int maxPeopleCount) {
        if (maxPeopleCount < 1) {
            throw new IllegalArgumentException();
        }
        this.maxPeopleCount = maxPeopleCount;
        return this;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        if (clients.size() < maxPeopleCount) {
            this.clients = clients;
        }
    }

    public boolean addClient(Client client) {
        if (clients.size() < maxPeopleCount) {
            this.clients.add(client);
            return true;
        }
        return false;
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
        Excursion excursion = (Excursion) o;
        return Double.compare(excursion.price, price) == 0 &&
                maxPeopleCount == excursion.maxPeopleCount &&
                clients == excursion.clients &&
                Objects.equals(guide, excursion.guide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), guide, price, maxPeopleCount, clients);
    }

    @Override
    public String toString() {
        return "Excursion{" +
                "guide=" + guide +
                ", price=" + price +
                ", maxPeopleCount=" + maxPeopleCount +
                ", clients=" + clients +
                '}';
    }
}
