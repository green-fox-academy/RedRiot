package com.greenfoxacademy.demo.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  AtomicLong click = new AtomicLong(0);
  @RequestMapping
  public Greeting greet(@RequestParam (value = "name",required = false) String name) {
    Greeting greet = new Greeting(click.getAndIncrement(), "Hello " + name + "!" );
    return greet ;
  }
}