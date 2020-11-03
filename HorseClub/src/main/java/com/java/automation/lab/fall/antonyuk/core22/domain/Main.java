package com.java.automation.lab.fall.antonyuk.core22.domain;

import com.java.automation.lab.fall.antonyuk.core22.domain.event.TrainingGroup;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> discounts = new HashMap<String, Integer>();
        discounts.put("Autumn discounts for everyone", 10);
        discounts.put("Summmer discounts for everyone", 5);
        discounts.put("For constant clients", 15);
        for (Map.Entry<String, Integer> element: discounts.entrySet()) {
            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }
        TrainingGroup trainingGroup = new TrainingGroup();
        System.out.println(discounts.get("s"));
    }
}
