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

    model.addAttribute("simba",simbaAccount.getName());
    model.addAttribute("2000", simbaAccount.getBalance());
    model.addAttribute("Currency", simbaAccount.getCurrency());
    model.addAttribute("lion", simbaAccount.getAnimalType());

    return "Template";
  }
  @RequestMapping("/inception")
  public String show1(Model model) {

    model.addAttribute("test","This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    model.addAttribute("test2", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");

    return "HTMLception";
  }
}
