package me.abdc.springdatabinding;

import java.beans.PropertyEditorSupport;

/**
 * Spring 3.0 이전까지 사용되던 방식
 * non-thread-safe
 */
public class EventEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        Event event = (Event) getValue();
        return event.getId().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Event event = new Event();
        event.setId(Long.parseLong(text));
        setValue(event);
    }
}
