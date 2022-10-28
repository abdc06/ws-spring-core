package me.abdc.springeventpublisher.event;

import org.springframework.context.ApplicationEvent;

/**
 * Spring 4.2 이전의 방식
 */
public class BeforeEvent extends ApplicationEvent {

    private int data;

    public BeforeEvent(Object source) {
        super(source);
    }

    public BeforeEvent(Object source, int data) {
        super(source);
        this.data = data;
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        return "MyEvent{" +
                "data=" + data +
                ", source=" + source +
                '}';
    }
}
