package me.abdc.springeventpublisher.handler;

import me.abdc.springeventpublisher.event.BeforeEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Spring 4.2 이전의 방식
 */
@Component
public class BeforeEventHandler implements ApplicationListener<BeforeEvent> {

    @Override
    public void onApplicationEvent(BeforeEvent event) {
        System.out.println("BeforeEvent 호출...");
        System.out.println("호출자: " + event.getSource());
        System.out.println("데이터: " + event.getData());
    }
}
