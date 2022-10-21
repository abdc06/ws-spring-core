package me.abdc.springcontext.event;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EventTest {

    @Autowired
    EventRepository eventRepository;

    @Autowired
    EventService eventService;

    @Test
    void test() {
        assertNotNull(eventRepository);
        assertNotNull(eventService);
        assertNotNull(eventService.eventRepository);
        assertEquals(eventRepository, eventService.eventRepository);
    }

}