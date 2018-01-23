package com.greenfoxacademy.demo.controller;


import com.greenfoxacademy.demo.model.Doubling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

  @Autowired
  Doubling doubling;

  @GetMapping("/")
  public String hello() {
    return "index";
  }

}
