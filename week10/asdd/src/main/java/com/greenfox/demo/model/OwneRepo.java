package com.greenfox.demo.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwneRepo extends CrudRepository<Owner, Integer> {

}
