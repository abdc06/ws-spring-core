package me.abdc.springenv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringEnvApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEnvApplication.class, args);
    }

}
