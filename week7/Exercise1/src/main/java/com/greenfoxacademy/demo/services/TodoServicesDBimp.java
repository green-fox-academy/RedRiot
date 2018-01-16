package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.ToDo;
import com.greenfoxacademy.demo.repositories.TodoRepository;
import com.sun.tools.javac.comp.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServicesDBimp implements TodoService {

  @Autowired
  TodoRepository todoRepository;


  @Override
  public List<ToDo> getAllTodos() {
    List<ToDo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    return todos;
  }

  @Override
  public ToDo getToDo(int id) {
    return todoRepository.findOne(id);
  }

  @Override
  public void create(ToDo toDo) {
    todoRepository.save(toDo);

  }

  @Override
  public void save(ToDo toDo) {
    todoRepository.save(toDo);
  }

  @Override
  public void delete(int id) {
    todoRepository.delete(id);

  }
}
