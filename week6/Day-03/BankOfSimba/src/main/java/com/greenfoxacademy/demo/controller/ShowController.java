package com.greenfoxacademy.demo.controller;

import com.greenfoxacademy.demo.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowController {
  BankAccount simbaAccount = new BankAccount("Simba",2000,"lion");

  @RequestMapping("/show")
  public String show(Model model) {

    model.addAttribute("sas",simbaAccount.toString());
    return "Template";
  }
}
