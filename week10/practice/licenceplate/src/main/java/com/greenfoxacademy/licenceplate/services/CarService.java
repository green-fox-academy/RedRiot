package com.greenfoxacademy.licenceplate.services;


import com.greenfoxacademy.licenceplate.models.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {

  List<Car> getAllCars();
  List<Car> getCarByLicencePlate(String plate, int police, int diplomat);
  List<Car> getCarByBrand(String brand);






}
