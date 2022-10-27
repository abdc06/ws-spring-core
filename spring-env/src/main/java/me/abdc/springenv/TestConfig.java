package me.abdc.springenv;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Bean
    public String hello() {
        return "hello!!";
    }

    @Bean
    public String bye() {
        return "bye~";
    }
}
