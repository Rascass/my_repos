package com.java.automation.lab.fall.antonyuk.core22.domain.person;

import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Horse;
import com.java.automation.lab.fall.antonyuk.core22.domain.subscription.ClientsContracts;
import com.java.automation.lab.fall.antonyuk.core22.domain.subscription.Subscription;

import javax.naming.InvalidNameException;
import java.util.*;

public class Client extends Person{

    private Set<Horse> horses;
    private ClientsContracts contracts;
    final private Date signIn;
    private boolean isBan;

    public Client() {
        signIn = new Date();
        horses = new HashSet<>();
    }

    public Client(PersonInfo personInfo, Set<Horse> horses, Date signIn, boolean isBan, ClientsContracts contracts) {
        super(personInfo);
        this.horses = horses;
        this.signIn = signIn;
        this.isBan = isBan;
        this.contracts = contracts;
    }

    public Client(PersonInfo personInfo) {
        super(personInfo);
        this.signIn = new Date();
        horses = new HashSet<>();
    }

    public Client(String firstName, String secondName, String lastName, Date birthday, Gender gender,
                  Set<Horse> horses,
                  Date signIn, boolean isBan, ClientsContracts contracts) throws InvalidNameException {
        super(firstName, secondName, lastName, birthday, gender);
        this.horses = horses;
        this.signIn = signIn;
        this.isBan = isBan;
        this.contracts = contracts;
    }

    public void addHorse(Horse horse) {
        horses.add(horse);
    }

    public boolean getBan() {
        return isBan;
    }

    public void setBan(boolean ban) {
        isBan = ban;
    }

    public Set<Horse> getHorses() {
        return horses;
    }

    public void setHorses(Set<Horse> horses) {
        this.horses = horses;
    }

    public Date getSignIn() {
        return signIn;
    }

    public ClientsContracts getContracts() {
        return contracts;
    }

    public void setContracts(ClientsContracts contracts) {
        this.contracts = contracts;
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
        Client client = (Client) o;
        return isBan == client.isBan &&
                Objects.equals(horses, client.horses) &&
                Objects.equals(contracts, client.contracts) &&
                Objects.equals(signIn, client.signIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), horses, contracts, signIn, isBan);
    }

    @Override
    public String toString() {
        return "Client{" +
                "horses=" + horses +
                ", contracts=" + contracts +
                ", signIn=" + signIn +
                ", isBan=" + isBan +
                '}';
    }
}

