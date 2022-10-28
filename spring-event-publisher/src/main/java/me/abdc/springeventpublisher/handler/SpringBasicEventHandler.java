package me.abdc.springeventpublisher.handler;

import org.springframework.context.event.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

@Component
public class SpringBasicEventHandler {

    @EventListener
    public void ContextRefreshedEventHandler(ContextRefreshedEvent event) {
        System.out.println("ContextRefreshedEvent 호출...");
        System.out.println("호출자: " + event.getSource());
        System.out.println("호출시간: " + LocalDateTime.ofInstant(Instant.ofEpochMilli(event.getTimestamp()), TimeZone.getDefault().toZoneId()));
        System.out.println();
    }

    @EventListener
    public void contextStartedEventHandler(ContextStartedEvent event) {
        System.out.println("ContextStartedEvent 호출...");
        System.out.println("호출자: " + event.getSource());
        System.out.println("호출시간: " + LocalDateTime.ofInstant(Instant.ofEpochMilli(event.getTimestamp()), TimeZone.getDefault().toZoneId()));
        System.out.println();
    }

    @EventListener
    public void contextStoppedEventHandler(ContextStoppedEvent event) {
        System.out.println("ContextStoppedEvent 호출...");
        System.out.println("호출자: " + event.getSource());
        System.out.println("호출시간: " + LocalDateTime.ofInstant(Instant.ofEpochMilli(event.getTimestamp()), TimeZone.getDefault().toZoneId()));
        System.out.println();
    }

    @EventListener
    public void contextClosedEventHandler(ContextClosedEvent event) {
        System.out.println("ContextClosedEvent 호출...");
        System.out.println("호출자: " + event.getSource());
        System.out.println("호출시간: " + LocalDateTime.ofInstant(Instant.ofEpochMilli(event.getTimestamp()), TimeZone.getDefault().toZoneId()));
        System.out.println();
    }

    @EventListener
    public void requestHandledEventHandler(RequestHandledEvent event) {
        System.out.println("RequestHandledEvent 호출...");
        System.out.println("호출자: " + event.getSource());
        System.out.println(event.getDescription());
        System.out.println("호출시간: " + LocalDateTime.ofInstant(Instant.ofEpochMilli(event.getTimestamp()), TimeZone.getDefault().toZoneId()));
        System.out.println();
    }
}
