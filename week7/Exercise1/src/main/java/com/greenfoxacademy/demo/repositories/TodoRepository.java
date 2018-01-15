package com.greenfoxacademy.demo.repositories;

import com.greenfoxacademy.demo.models.ToDo;
import com.sun.tools.javac.comp.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<ToDo, Integer> {


}

