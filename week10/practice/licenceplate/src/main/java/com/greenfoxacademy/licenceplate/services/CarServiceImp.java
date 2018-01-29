package com.greenfoxacademy.licenceplate.services;

import com.greenfoxacademy.licenceplate.models.Car;
import com.greenfoxacademy.licenceplate.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
  @Autowired
  CarRepository carRepository;

  @Override
  public List<Car> getAllCars() {
    return (List<Car>) carRepository.findAll();
  }

  @Override
  public List<Car> getCarByLicencePlate(String plate) {
    List<Car> LicencePlatesOfGivenString = new ArrayList<>();
    carRepository.findAllByPlateContaining(plate).forEach(LicencePlatesOfGivenString::add);

    return LicencePlatesOfGivenString;
  }

  @Override
  public List<Car> diplomatCar() {
    return carRepository.findAllByPlateStartsWith("DT");
  }

  @Override
  public List<Car> policeCars() {
    return carRepository.findAllByPlateStartsWith("RB");
  }


  @Override
  public List<Car> getCarByBrand(String brand) {
    return carRepository.findAllByCarBrand(brand);
  }
}
