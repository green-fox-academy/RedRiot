package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

  void saveProduct(Product product);
  void updateProduct(Product product);
  void delete(long id);
  List<Product> findAllProduct();
  Product findOne(long id);
  List<Product>search(String name);
  List<Product> selected();



}
