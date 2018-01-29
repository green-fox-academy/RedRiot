package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.Product;
import com.greenfoxacademy.demo.repositories.ProductRepository;
import com.greenfoxacademy.demo.services.ProductService;
import com.greenfoxacademy.demo.services.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AdminController {

  @Autowired
  ProductServiceImp productServiceImp;


  @GetMapping("/admin/")
  public String list(Model model) {
    List<Product> productList = productServiceImp.findAllProduct();
    model.addAttribute("productList",productList);
    return "index";
  }

  @PostMapping(value = "/add/")
  public ModelAndView add(Model model, @ModelAttribute Product product) {

    productServiceImp.saveProduct(product);
    return new ModelAndView("redirect:/admin/");

  }

  @GetMapping("/add/")
  public String create(Model model) {
    Product product = new Product();
    model.addAttribute("product", product);
    return "add";
  }

  @PostMapping("/admin/delete/{productId}")
  public String deleteApplicant(@PathVariable int productId) {
    productServiceImp.delete(productId);
    return "redirect:/admin/";
  }
  @GetMapping("admin/edit/{productId}")
  public String getEditPage(@PathVariable int productId, Model model){
    model.addAttribute("product", productServiceImp.findOne(productId));
    return "edit";
  }

  @PostMapping("/edit/{productId}")
  public ModelAndView editTodo(@PathVariable int productId, @ModelAttribute Product product) {
    product.setId(productId);
    productServiceImp.updateProduct(product);
    return new ModelAndView("redirect:/admin/");
  }

  @RequestMapping(value = "/admin/search")
  public String searchTask(@RequestParam(value ="search",required = false) String product,Model model) {
    List<Product> list = productServiceImp.search(product);
    model.addAttribute("productList", list);
    return "index";
  }

}