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
  public List<Car> getCarByLicencePlate(String plate,int police,int diplomat) {
    if (police==(1)) {
      return carRepository.findAllByPlateStartsWith("RB");
    }
    else if (diplomat==1) {
      return carRepository.findAllByPlateStartsWith("DT");
    }
      return carRepository.findAllByPlateStartsWith(plate);
  }

  @Override
  public List<Car> getCarByBrand(String brand) {
    return carRepository.findAllByCarBrand(brand);
  }
}
