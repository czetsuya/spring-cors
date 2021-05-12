package com.czetsuyatech.springcors.controller;

import java.util.HashMap;
import java.util.Map;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
@RestController
@RequestMapping("/books")
@Log4j2
public class BookController {

  @GetMapping
  public Map<String, String> getBooks() {

    log.debug("/books");

    Map<String, String> books = new HashMap<>();
    books.put("1", "Hamlet");
    books.put("2", "Macbeth");
    books.put("3", "Romeo and Juliet");
    return books;
  }

}
