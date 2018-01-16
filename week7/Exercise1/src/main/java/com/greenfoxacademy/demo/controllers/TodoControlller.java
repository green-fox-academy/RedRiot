package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.ToDo;
import com.greenfoxacademy.demo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Controller
@RequestMapping("/todo")
public class TodoControlller {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping({"/", "/list"})
  public String list(@RequestParam(value = "isActive", required = false) Boolean isActive, Model model) {

    List<ToDo> todosList = new ArrayList<>();
    if (isActive == null) {
      todoRepository.findAll().forEach(todosList::add);
    } else if (!isActive) {
      todosList = StreamSupport.stream(todoRepository.findAll().spliterator(), false)
              .filter(p -> p.isDone())
              .collect(Collectors.toList());
    } else {
      todosList = StreamSupport.stream(todoRepository.findAll().spliterator(), false)
              .filter(p -> !p.isDone())
              .collect(Collectors.toList());
    }
    model.addAttribute("todosList", todosList);
    return "todo";

  }
}
