package me.abdc.springcontext.book;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookTest {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookService bookService;

    @Test
    void test() {
        assertNotNull(bookRepository);
        assertNotNull(bookService);
        assertNotNull(bookService.bookRepository);
        assertEquals(bookRepository, bookService.bookRepository);
    }

}