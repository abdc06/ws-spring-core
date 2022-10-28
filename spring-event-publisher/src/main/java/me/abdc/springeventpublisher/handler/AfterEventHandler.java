package me.abdc.springeventpublisher.handler;

import me.abdc.springeventpublisher.event.AfterEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Spring 4.2 이후의 방식
 */
@Component
public class AfterEventHandler {

    @EventListener
    public void handle(AfterEvent event) {
        System.out.println("AfterEvent 호출...");
        System.out.println("호출자: " + event.getSource());
        System.out.println("데이터: " + event.getData());
    }
}
