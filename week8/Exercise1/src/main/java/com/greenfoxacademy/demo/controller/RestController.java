package com.greenfoxacademy.demo.controller;

import com.greenfoxacademy.demo.model.Doubling;
import com.greenfoxacademy.demo.model.Error;
import org.springframework.web.bind.annotation.GetMapping;
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

}
