package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.User;
import com.greenfoxacademy.demo.services.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
  @Autowired
  UserServiceImp userServiceImp;


  @GetMapping("/login")
  public String getLogin(Model  model) {
    model.addAttribute("user", new User());
    return "login";
  }

  @PostMapping("/login")
  public String loginURL(Model model, @ModelAttribute User user) {
    User userloggedin = userServiceImp.findByName(user.getUsername());
    model.addAttribute("user", userloggedin);
    return "/todo/";
  }
}
