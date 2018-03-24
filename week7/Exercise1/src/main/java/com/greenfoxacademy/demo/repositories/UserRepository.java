package com.greenfoxacademy.demo.repositories;
import com.greenfoxacademy.demo.models.User;
import com.sun.tools.javac.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository< User, Long>{
  User findByUsername(String name);
  User findByPassword(String password);
}
