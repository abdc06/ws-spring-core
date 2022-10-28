package me.abdc.springeventpublisher;

import me.abdc.springeventpublisher.event.AfterEvent;
import me.abdc.springeventpublisher.event.BeforeEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationEventPublisher eventPublisher;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        eventPublisher.publishEvent(new BeforeEvent(this, 100));
        eventPublisher.publishEvent(new AfterEvent(this, 200));
    }
}
