package me.abdc.springdatabinding;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class EventFormatter implements Formatter<Event> {

    @Override
    public Event parse(String text, Locale locale) throws ParseException {
        Event event = new Event();
        event.setId(Long.parseLong(text));
        return event;
    }

    @Override
    public String print(Event object, Locale locale) {
        return object.getId().toString();
    }
}
