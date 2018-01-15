package com.greenfoxacademy.demo;

import com.greenfoxacademy.demo.models.ToDo;
import com.greenfoxacademy.demo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	TodoRepository todoRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new ToDo("I have to learn Object Relational Mapping"));

	}
}