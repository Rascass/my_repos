package com.java.automation.lab.fall.antonyuk.core22.domain.club;

import com.java.automation.lab.fall.antonyuk.core22.domain.Util;
import com.java.automation.lab.fall.antonyuk.core22.domain.building.RidingHall;
import com.java.automation.lab.fall.antonyuk.core22.domain.building.Stable;
import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;
import com.java.automation.lab.fall.antonyuk.core22.domain.constant.Env;
import com.java.automation.lab.fall.antonyuk.core22.domain.event.Event;
import com.java.automation.lab.fall.antonyuk.core22.domain.exception.IncorrectNameFileException;
import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Horse;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Client;
import com.java.automation.lab.fall.antonyuk.core22.domain.person.Employee;

import javax.naming.InvalidNameException;
import java.io.IOException;
import java.util.*;

public class HorseClub {

    private String name;
    private Address address;
    private Set<Client> clients = new HashSet<>();
    private Set<Horse> horses = new HashSet<>();
    private Set<Employee> employees = new HashSet<>();
    private RidingHall ridingHall;
    private Stable stable;
    private Set<Event> events = new LinkedHashSet<>();

    public HorseClub() {
    }

    public HorseClub(String name, Address address, Set<Client> clients, Set<Horse> horses,
                     Set<Employee> employees, RidingHall ridingHall, Stable stable,
                     Set<Event> events) throws InvalidNameException {
        this.setName(name);
        this.address = address;
        this.clients = clients;
        this.horses = horses;
        this.employees = employees;
        this.ridingHall = ridingHall;
        this.stable = stable;
        this.events = events;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidNameException {
        if (!Validator.isValidName(name)) {
            throw new InvalidNameException();
        }
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public Set<Horse> getHorses() {
        return horses;
    }

    public void setHorses(Set<Horse> horses) {
        this.horses = horses;
    }

    public void addHorse(Horse horse) {
        this.horses.add(horse);
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public RidingHall getRidingHall() {
        return ridingHall;
    }

    public void setRidingHall(RidingHall ridingHall) {
        this.ridingHall = ridingHall;
    }

    public Stable getStable() {
        return stable;
    }

    public void setStable(Stable stable) {
        this.stable = stable;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }

    public void addEvent(Event event, int index) {
        this.events.add(event);
    }

    public String readClients() throws IOException, IncorrectNameFileException {
        return Util.read(Env.CLIENT_PATH);
    }

    public String readEmployees() throws IOException, IncorrectNameFileException {
        return Util.read(Env.EMPLOYEE_PATH);
    }

    public String readHorses() throws IOException, IncorrectNameFileException {
        return Util.read(Env.HORSE_PATH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HorseClub horseClub = (HorseClub) o;
        return Objects.equals(name, horseClub.name) &&
                Objects.equals(address, horseClub.address) &&
                Objects.equals(clients, horseClub.clients) &&
                Objects.equals(horses, horseClub.horses) &&
                Objects.equals(employees, horseClub.employees) &&
                Objects.equals(ridingHall, horseClub.ridingHall) &&
                Objects.equals(stable, horseClub.stable) &&
                Objects.equals(events, horseClub.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, clients, horses, employees, ridingHall, stable, events);
    }

    @Override
    public String toString() {
        return "HorseClub{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", clients=" + clients +
                ", horses=" + horses +
                ", employees=" + employees +
                ", ridingHall=" + ridingHall +
                ", stable=" + stable +
                ", competitions=" + events +
                '}';
    }
}
