package com.greenfoxacademy.demo.controller;

import com.greenfoxacademy.demo.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowController {
  BankAccount simbaAccount = new BankAccount(false,"Simba",2000,"lion");

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

    return "HTMLception";
  }




  @RequestMapping("/accounts")
  public String Accounts(Model model) {
    List<BankAccount> accountList = new ArrayList<>();
    accountList.add(new BankAccount(true,"Nara", 3000, "lion"));
    accountList.add(new BankAccount(false,"scar", 2500, "lion"));
    accountList.add(new BankAccount(true,"rafiki", 1800, "monkey",true));
    accountList.add(new BankAccount(false,"timon", 500, "suricata"));

    model.addAttribute("list", accountList);


    return "Accounts";
  }
}
