package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.User;
import com.greenfoxacademy.demo.services.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
  @Autowired
  UserServiceImp userServiceImp;

  @GetMapping("/login")
  public String showLogin(Model model) {
    User user = new User();
    model.addAttribute("user", user);
    return "login";
  }

  @PostMapping("/login")
  public String loginURL(@ModelAttribute User user) {
    if (userServiceImp.access(user.getUsername(),user.getPassword())) {
      return "redirect:/todo/";
    }
    return "todo";
  }
}
