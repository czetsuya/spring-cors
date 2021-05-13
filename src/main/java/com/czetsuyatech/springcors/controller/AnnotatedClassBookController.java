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
@RequestMapping("/annotated-class/books")
@Log4j2
@CrossOrigin(originPatterns = "http://192.168.1.9:3000")
public class AnnotatedClassBookController {

  @GetMapping
  public Map<String, String> getBooks() {

    log.debug("/annotated-class/books");

    Map<String, String> books = new HashMap<>();
    books.put("1", "Hamlet");
    books.put("2", "Macbeth");
    books.put("3", "Romeo and Juliet");
    return books;
  }

}
