package car.demo.controllers;

import car.demo.models.DTO.LicenceDTO;
import car.demo.services.LicencePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  LicencePlateService licencePlateService;

  @GetMapping("/api/search/{brand}")
  public LicenceDTO responseDTO(@PathVariable String brand) {
    return (LicenceDTO) licencePlateService.response(brand);

  }

}
