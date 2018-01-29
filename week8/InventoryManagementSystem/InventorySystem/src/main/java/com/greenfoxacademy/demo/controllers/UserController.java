package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.Product;
import com.greenfoxacademy.demo.services.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
  @Autowired
  ProductServiceImp productServiceImp;

  @GetMapping("/")
  public String list(Model model, Product product) {
    List<Product> listing = productServiceImp.findAllProduct();
    model.addAttribute("listing", listing);
    return "main";
  }
  @PostMapping("/select/{productId}")
  public String select(@PathVariable long productId,Product product) {
    Product newProduct = productServiceImp.findOne(productId);
    newProduct.setItemBuying(product.getItemBuying());
    productServiceImp.updateProduct(newProduct);
    return "redirect:/";
  }


  @RequestMapping(value ="/selected")
  public String selectedList(Model model) {
    List<Product> selectedList = productServiceImp.selected();
    int totalPrice = 0;
    for (int i = 0; i <selectedList.size() ; i++) {
      totalPrice = totalPrice + selectedList.get(i).totalPriceforOneKindOfProduct();
    }
    model.addAttribute("totalPrice", totalPrice);
    model.addAttribute("selectedList",selectedList);
    return "SelectedProduct";
  }
 @GetMapping (value="/buy")
  public String returnToMainPage(Model model) {
   List<Product> selectedList = productServiceImp.selected();
   for (int i = 0; i < selectedList.size(); i++) {
     selectedList.get(i).decreaseQuantity();
     selectedList.get(i).setItemBuying(0);
     productServiceImp.updateProduct(selectedList.get(i));
   }
   return "redirect:/";
 }
}
