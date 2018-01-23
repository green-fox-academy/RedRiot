package com.greenfoxacademy.demo.controller;

import com.greenfoxacademy.demo.model.Appenda;
import com.greenfoxacademy.demo.model.Doubling;
import com.greenfoxacademy.demo.model.Error;
import com.greenfoxacademy.demo.model.Greeter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController

public class RestController {
  @GetMapping("/doubling")
  public Object doublingTheObject(@RequestParam(value = "input", required = false) Integer number) {
    if (number != null) {
      return new Doubling(number);
    }
    return new Error("Please provide an input!");
  }

  @GetMapping("/greeter")
  public Object greeting(@RequestParam(value = "name", required = false) String name,
                         @RequestParam(value = "title", required = false) String title) {

    if (name == null) {
      return new Error("Please provide a name!");
    } else if (title == null) {
      return new Error("Please provide a title!");
    } else {
      return new Greeter(name, title);
    }

  }

  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable  String appendable) {

    if (appendable == null) {
      return new Error("404");
    }
    return new Appenda(appendable);
  }
}
