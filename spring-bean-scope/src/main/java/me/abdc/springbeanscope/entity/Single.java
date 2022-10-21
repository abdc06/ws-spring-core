package me.abdc.springbeanscope.entity;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Single {

    @Autowired
    private Proto proto;

    @Autowired
    private ObjectProvider<Proto> anotherProto;

    public Proto getProto() {
        return proto;
    }

    public Proto getAnotherProto() {
        return anotherProto.getIfAvailable();
    }
}
