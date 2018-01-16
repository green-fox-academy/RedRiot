package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.ToDo;
import com.greenfoxacademy.demo.repositories.TodoRepository;
import com.greenfoxacademy.demo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Controller
@RequestMapping("/todo")
public class TodoControlller {

  @Autowired
  TodoRepository todoRepository;
  @Autowired
  TodoService todoService;

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

  @PostMapping(value = "/add/")
  public ModelAndView add(Model model, @ModelAttribute ToDo toDo) {
    System.out.println(toDo.getTitle());
    todoService.save(toDo);
    return new ModelAndView("redirect:/todo/");

  }

  @GetMapping("/add/")
  public String create(Model model) {
    ToDo todo = new ToDo();
    model.addAttribute("todo", todo);
    return "add";
  }

  @PostMapping("/delete/{taskId}")
  public String deleteApplicant(@PathVariable int taskId) {
    todoService.delete(taskId);
    return "redirect:/todo/";

  }

  @GetMapping("/edit/{taskId}")
  public String getEditPage(@PathVariable int taskId, Model model){
    model.addAttribute("todo", todoService.getToDo(taskId));
    return "edit";
  }

  @PostMapping("/edit/{taskId}")
  public String editTodo(@PathVariable int taskId, @ModelAttribute ToDo todo){
    todo.setId(taskId);
    todoService.save(todo);
    return "redirect:/todo/";
  }

}
