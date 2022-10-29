package me.abdc.springresource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ResourceLoader loader;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Resource resource = loader.getResource("classpath:text.txt");
        System.out.println(resource.exists());
        System.out.println(resource.getDescription());

        if (resource.exists()) {
            System.out.println(Files.readString(Path.of(resource.getURI())));
        }
    }
}
