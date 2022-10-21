package me.abdc.springioc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BookService {

    final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book save(Book book) {
        book.setId(1L);
        book.setTitle("Spring core");
        book.setCreatedOn(LocalDateTime.now());
        return bookRepository.save(book);
    }
}
