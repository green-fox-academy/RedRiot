package com.greenfoxacademy.demo.controller;

import com.greenfoxacademy.demo.models.BankAccount;
import com.sun.xml.internal.rngom.digested.DDataPattern;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowController {
  BankAccount simbaAccount = new BankAccount(false, "Simba", 2000, "lion",false );
  List<BankAccount> accountList = new ArrayList<>();

  @RequestMapping("/show")
  public String show(Model model) {

    model.addAttribute("simba", simbaAccount.getName());
    model.addAttribute("2000", simbaAccount.getBalance());
    model.addAttribute("Currency", simbaAccount.getCurrency());
    model.addAttribute("lion", simbaAccount.getAnimalType());

    return "Template";
  }

  @RequestMapping("/inception")
  public String show1(Model model) {
    model.addAttribute("test", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");

    return "HTMLception";
  }


  @RequestMapping("/accounts")
  public String accounts(Model model) {

    accountList.add(new BankAccount(false,"Nara", 3000, "lion",false));
    accountList.add(new BankAccount( false ,"scar",  2500,"lion",false));
    accountList.add(new BankAccount( true, "ratata", 1800, "monkey",true));
    accountList.add(new BankAccount(false, "timon", 500, "suricata",false));

    model.addAttribute("list", accountList);


    return "Accounts";
  }
  @RequestMapping(value = "/accounts/raise", method= RequestMethod.POST)
  public String accountsRaise(@ModelAttribute BankAccount bankAccount, Model model) {
    for (BankAccount actualBankAccount :accountList) {
      if (actualBankAccount.isKing()) {
        actualBankAccount.setBalance(actualBankAccount.getBalance() + 10);
      } else {
        actualBankAccount.setBalance(actualBankAccount.getBalance() + 100);
      }
    }
    model.addAttribute("list", accountList);

    return "Accounts";
  }
}



