package com.makotojava.learn.HelloSpringBoot;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class HelloRestController {


@RequestMapping("/hello")
  public String hello() {
    return "Hello. All your base are belong to us.";
  }
}