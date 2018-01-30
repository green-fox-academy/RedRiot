package com.greenfoxacademy.licenceplate.controllers;

import com.greenfoxacademy.licenceplate.models.Response;
import com.greenfoxacademy.licenceplate.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {
  @Autowired
  CarService carService;

  @GetMapping("/api/search/{brand}")
  public Response restBrandResponse(@PathVariable String brand) {
   return carService.restRespoonse(brand);
  }
  }
