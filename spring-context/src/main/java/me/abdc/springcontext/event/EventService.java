package me.abdc.springcontext.event;

import org.springframework.stereotype.Service;

@Service
public class EventService {

    final  EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }
}
