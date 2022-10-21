package me.abdc.springcontext.book;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {

    @Bean
    BookRepository bookRepository() {
        return new BookRepository();
    }

    @Bean
    BookService bookService(BookRepository bookRepository) {
        return new BookService(bookRepository);
    }
}
