package car.demo.controllers;

import car.demo.services.LicencePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlateController {
  @Autowired
  LicencePlateService licencePlateService;

  @GetMapping("/")
  public String showAllPlates(Model model) {

    model.addAttribute("listOfPlates", licencePlateService.listOfPlates());

    return "index";
  }

  @GetMapping("/search")
  public String searchPlate(@RequestParam(defaultValue = "") String q,
                            @RequestParam (defaultValue = "0")int police,
                            @RequestParam (defaultValue = "0")int diplomat, Model model) {
    if (licencePlateService.plateValidator(q) || police == 1 || diplomat == 1) {
      model.addAttribute("listOfPlates", licencePlateService.searchPlates(q, police, diplomat));
    }
    model.addAttribute("error", "Sorry, the submitted licence plate is not valid");

    return "index";
  }

  @GetMapping("/search/{brand}")
  public String listBrand(@PathVariable (name = "brand")String brand, Model model) {
    model.addAttribute("listOfPlates", licencePlateService.brandLister(brand));
    return "index";
  }
}
