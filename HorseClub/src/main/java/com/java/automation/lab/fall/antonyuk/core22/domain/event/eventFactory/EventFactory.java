package com.java.automation.lab.fall.antonyuk.core22.domain.event.eventFactory;

import com.java.automation.lab.fall.antonyuk.core22.domain.event.*;

public class EventFactory {

    private EventFactory() {}

    public static Event createEvent(EventInfo eventInfo, EventType event) {
        if (event == EventType.COMPETITION) {
            return new Competition(eventInfo);
        }
        if (event == EventType.EXCURSION) {
            return new Excursion(eventInfo);
        }
        return new MasterClass(eventInfo);
    }
}
