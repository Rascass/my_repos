package com.java.automation.lab.fall.antonyuk.core22.domain.subscription;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ClientsContracts {

    private Map<String, Subscription> subscriptionMap;

    public ClientsContracts() {
        subscriptionMap = new HashMap<>();
    }

    public ClientsContracts(Map<String, Subscription> subscriptionMap) {
        this.subscriptionMap = subscriptionMap;
    }

    public Contract getContract(String contractNumber) {
        Subscription temp = subscriptionMap.get(contractNumber);
        return new Contract(contractNumber, temp);
    }

    public void addContract(Contract contract) {
        subscriptionMap.put(contract.getNumber(), contract.getSubscription());
    }

    public void deleteContract(Contract contract) {
        subscriptionMap.remove(contract.getNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClientsContracts that = (ClientsContracts) o;
        return Objects.equals(subscriptionMap, that.subscriptionMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionMap);
    }

    @Override
    public String toString() {
        return "ClientsContracts{" +
                "subscriptionMap=" + subscriptionMap +
                '}';
    }
}

