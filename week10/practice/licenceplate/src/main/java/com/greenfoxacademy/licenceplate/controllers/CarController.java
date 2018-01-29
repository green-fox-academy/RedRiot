package com.greenfoxacademy.licenceplate.controllers;

import com.greenfoxacademy.licenceplate.repositories.CarRepository;
import com.greenfoxacademy.licenceplate.services.CarService;
import com.greenfoxacademy.licenceplate.services.CarServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
  @Autowired
  CarService carService;
  @Autowired
  CarRepository carRepository;

  @GetMapping("/")
  public String showOpenPage(Model model) {
    model.addAttribute("listOfAllCars", carService.getAllCars());
    return "index";
  }

  @GetMapping("/search")
  public String searchCar(@RequestParam(value = "q", required = false, defaultValue = "") String q,
                          @RequestParam(value = "police", required = false, defaultValue = "0") int police,
                          @RequestParam(value = "diplomat", required = false, defaultValue = "0") int diplomat, Model model) {

    model.addAttribute("listOfAllCars", carService.getCarByLicencePlate(q, police, diplomat));
    return "index";
  }

  @RequestMapping("/search/{brand}")
  public String search(@PathVariable("brand") String brand, Model model) {
    model.addAttribute("listOfAllCars", carService.getCarByBrand(brand));
    return "index";
  }
}
