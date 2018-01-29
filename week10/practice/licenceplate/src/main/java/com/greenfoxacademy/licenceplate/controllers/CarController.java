package com.greenfoxacademy.licenceplate.controllers;

import com.greenfoxacademy.licenceplate.repositories.CarRepository;
import com.greenfoxacademy.licenceplate.services.CarService;
import com.greenfoxacademy.licenceplate.services.CarServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
                          @RequestParam(value = "police", required = false, defaultValue = "0") String police,
                          @RequestParam(value = "diplomat", required = false, defaultValue = "0") String diplomat, Model model) {
    if (!q.equals("")) {
      model.addAttribute("listOfAllCars", carService.getCarByLicencePlate(q));
    }
    else if (!police.equals("0")) {
      model.addAttribute("listOfAllCars", carService.policeCars());
      return "index";
    }
    else if (!diplomat.equals("0")) {
      model.addAttribute("listOfAllCars", carService.diplomatCar());
      return "index";
    } else {
    model.addAttribute("listOfAllCars", carService.getAllCars());
    }
    return "index";
  }

/*
  @GetMapping("/search")
  public String searchPoliceCar(@RequestParam String search, Model model) {
    model.addAttribute("PoliceCar", carService.getSpecialCar("RB"));

    return "redirect:/";
  }
  @GetMapping("/search")
  public String searchDiplomatCar(@RequestParam String search, Model model) {
    model.addAttribute("DiplomatCar", carService.getSpecialCar("DT"));

    return "redirect:/";
  }
*/

}
