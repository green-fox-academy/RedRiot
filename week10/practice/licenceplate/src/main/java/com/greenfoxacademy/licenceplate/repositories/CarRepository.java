package com.greenfoxacademy.licenceplate.repositories;

import com.greenfoxacademy.licenceplate.models.Car;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
  List<Car> findAllByPlateContaining(String plate);
  List<Car> findAllByPlateStartsWith(String specialPlate);
  List<Car> findAllByCarBrand(String brand);




}
