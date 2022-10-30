package me.abdc.springdatabinding;

import org.springframework.core.convert.converter.Converter;

public class EventConverter {

    public static class StringToEventConverter implements Converter<String, Event> {

        @Override
        public Event convert(String source) {
            Event event = new Event();
            event.setId(Long.parseLong(source));
            return event;
        }
    }

    public static class EventToStringConverter implements Converter<Event, String> {

        @Override
        public String convert(Event source) {
            return source.getId().toString();
        }
    }
}
