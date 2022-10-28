package me.abdc.springmessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(messageSource.getMessage("greeting", new String[]{"Message"}, Locale.getDefault()));
        System.out.println(messageSource.getMessage("greeting", new String[]{"Message"}, Locale.ENGLISH));
        System.out.println(messageSource.getMessage("greeting", new String[]{"Message"}, Locale.KOREA));
    }
}
