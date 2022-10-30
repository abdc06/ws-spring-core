package me.abdc.springdatabinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ConversionService conversionService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        /**
         * WebConversionService
         * Converter, Formatter 빈을 찾아 자동으로 등록
         */
        System.out.println(conversionService.getClass());
        System.out.println(conversionService);
    }
}
