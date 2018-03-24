package com.greenfoxacademy.log.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
  @GetMapping("/log")
  public Object Logger() {

  }
}
