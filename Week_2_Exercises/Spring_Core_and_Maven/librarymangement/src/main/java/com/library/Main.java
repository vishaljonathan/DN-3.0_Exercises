package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class Main {
  public static void main(String[] args) {
    // Load Spring context from XML configuration file
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    // Retrieve BookService bean and test it
    BookService bookService = context.getBean(BookService.class);

    // Call a method on the BookService to trigger AOP advice
    bookService.someServiceMethod(); // Replace with an actual method call
  }
}

//Output:
/*
--- exec:3.1.0:exec (default-cli) @ librarymanagement ---
[main] INFO com.library.aspect.LoggingAspect - Before executing method: void com.library.service.BookService.someServiceMethod()
Service method executed
[main] INFO com.library.aspect.LoggingAspect - After executing method: void com.library.service.BookService.someServiceMethod()
*/