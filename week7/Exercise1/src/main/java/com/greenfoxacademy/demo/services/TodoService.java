package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.ToDo;
import com.sun.tools.javac.comp.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {
  List<ToDo> getAllTodos();
  ToDo getToDo(int id);
  void create(ToDo toDo);
  void save(ToDo toDo);
  void delete(int id);

}
