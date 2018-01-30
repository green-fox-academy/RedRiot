package com.greenfoxacademy.licenceplate.services;


import com.greenfoxacademy.licenceplate.models.Car;
import com.greenfoxacademy.licenceplate.models.Response;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {

  List<Car> getAllCars();
  List<Car> getCarByLicencePlate(String plate, int police, int diplomat);
  List<Car> getCarByBrand(String brand);
  Response restRespoonse(String brand);
  boolean plateValidator(String plate);






}
