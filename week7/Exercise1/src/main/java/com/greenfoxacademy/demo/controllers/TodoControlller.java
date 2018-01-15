package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.ToDo;
import com.greenfoxacademy.demo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/todo")
public class TodoControlller {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping({"/", "/list"})
  public String list(Model model){
    List<ToDo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    model.addAttribute("todos", todos);
    return "todo";
  }
}
