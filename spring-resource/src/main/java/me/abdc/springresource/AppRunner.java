package me.abdc.springresource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ResourceLoader loader;

    @Autowired
    ApplicationContext context;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Resource resource = loader.getResource("classpath:text.txt");
        System.out.println(resource.exists());
        System.out.println(resource.getDescription());

        if (resource.exists()) {
            System.out.println(Files.readString(Path.of(resource.getURI())));
        }

        /********************************************************************/
        Resource resource1 = context.getResource("classpath:text.txt");
        Resource resource2 = context.getResource("text.txt");

        System.out.println(resource1.getClass());   //ClassPathResource
        System.out.println(resource2.getClass());   //ServletContextResource

        System.out.println(resource1.exists()); //true
        System.out.println(resource2.exists()); //false

        System.out.println(resource1.getDescription());
        System.out.println(resource2.getDescription());

        System.out.println(Files.readString(Path.of(resource1.getURI())));
        System.out.println(Files.readString(Path.of(resource2.getURI())));  //FileNotFoundException
    }
}
