package me.abdc.springvalidation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    Validator validator;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Event event = new Event();
        EventValidator eventValidator = new EventValidator();
        Errors errors = new BeanPropertyBindingResult(event, "event");

        eventValidator.validate(event, errors);

        System.out.println(errors.hasErrors());

        errors.getAllErrors().forEach(e -> {
            Arrays.stream(e.getCodes()).forEach(System.out::println);
            System.out.println(e.getDefaultMessage());
        });

        System.out.println();
        /***************************************************************/
        System.out.println(validator.getClass());

        Book book = new Book();
        book.setPrice(-1000);
        Errors bookErrors = new BeanPropertyBindingResult(book, "book");

        validator.validate(book, bookErrors);

        System.out.println(bookErrors.hasErrors());

        bookErrors.getAllErrors().forEach(e -> {
            Arrays.stream(e.getCodes()).forEach(System.out::println);
            System.out.println(e.getDefaultMessage());
        });
    }
}
