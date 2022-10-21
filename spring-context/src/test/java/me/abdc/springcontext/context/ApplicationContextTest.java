package me.abdc.springcontext.context;

import me.abdc.springcontext.book.BookConfig;
import me.abdc.springcontext.book.BookService;
import me.abdc.springcontext.event.EventConfig;
import me.abdc.springcontext.event.EventService;
import me.abdc.springcontext.post.PostService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ApplicationContextTest {

    @Test
    void annotationContext() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));

        BookService bookService = (BookService) context.getBean("bookService");

        assertNotNull(bookService);
        assertNotNull(bookService.getBookRepository());
    }

    @Test
    void annotationContext2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));

        EventService eventService = (EventService) context.getBean("eventService");

        assertNotNull(eventService);
        assertNotNull(eventService.getEventRepository());
    }

    @Test
    void xmlContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));

        PostService postService = (PostService) context.getBean("postService");

        assertNotNull(postService);
        assertNotNull(postService.getPostRepository());
    }
}
