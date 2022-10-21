package me.abdc.springbeanscope.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootApplication
@ExtendWith(SpringExtension.class)
class EntityTest {

    @Autowired
    ApplicationContext context;

    @Test
    void entityTest() {
        System.out.println("---------- proto ----------");
        System.out.println(context.getBean(Proto.class));
        System.out.println(context.getBean(Proto.class));
        System.out.println(context.getBean(Proto.class));

        System.out.println("\n---------- single ----------");
        System.out.println(context.getBean(Single.class));
        System.out.println(context.getBean(Single.class));
        System.out.println(context.getBean(Single.class));

        System.out.println("\n---------- proto by single ----------");
        System.out.println(context.getBean(Single.class).getProto());
        System.out.println(context.getBean(Single.class).getProto());
        System.out.println(context.getBean(Single.class).getProto());

        System.out.println("\n---------- anotherProto by single ----------");
        System.out.println(context.getBean(Single.class).getAnotherProto());
        System.out.println(context.getBean(Single.class).getAnotherProto());
        System.out.println(context.getBean(Single.class).getAnotherProto());
    }

}