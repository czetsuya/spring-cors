package com.czetsuyatech.springcors.controller;

import java.util.HashMap;
import java.util.Map;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
@RestController
@RequestMapping("/annotated-method/books")
@Log4j2
public class AnnotatedMethodBookController {

  @CrossOrigin(originPatterns = "http://192.168.1.9:3000")
  @GetMapping
  public Map<String, String> getBooks() {

    log.debug("/annotated-method/books");

    Map<String, String> books = new HashMap<>();
    books.put("1", "Hamlet");
    books.put("2", "Macbeth");
    books.put("3", "Romeo and Juliet");
    return books;
  }

  @GetMapping("/restricted")
  public Map<String, String> getBooksRestricted() {

    log.debug("/annotated-method/books/restricted");

    Map<String, String> books = new HashMap<>();
    books.put("1", "Hamlet");
    books.put("2", "Macbeth");
    books.put("3", "Romeo and Juliet");
    return books;
  }

}
