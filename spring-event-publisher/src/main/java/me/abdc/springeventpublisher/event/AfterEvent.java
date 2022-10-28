package me.abdc.springeventpublisher.event;

/**
 * Spring 4.2 이후의 방식
 */
public class AfterEvent {

    private Object source;

    private int data;

    public AfterEvent(Object source, int data) {
        this.data = data;
        this.source = source;
    }

    public Object getSource() {
        return source;
    }

    public int getData() {
        return data;
    }
}
