package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.Product;
import com.greenfoxacademy.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImp implements ProductService{

  @Autowired
  ProductRepository productRepository;

  @Override
  public void saveProduct(Product product) {
    productRepository.save(product);

  }

  @Override
  public void updateProduct(Product product) {
    productRepository.save(product);

  }



  @Override
  public void delete(long id) {
    productRepository.delete(id);

  }

 /* @Override*/
  public List<Product> findAllProduct() {
    List<Product> productList = new ArrayList<>();
/*

*/
     productRepository.findAll().forEach(productList::add);
    return productList;
  }

  @Override
  public Product findOne(long id) {
    return productRepository.findOne(id);
  }

  @Override
  public List<Product> search(String name) {
    List<Product> list = productRepository.findAllByNameContains(name);
    return list;
  }

  @Override
  public List<Product> selected() {
    List<Product> selectedProduct = new ArrayList<>();
    productRepository.findAllByItemBuyingGreaterThan(0).forEach(selectedProduct::add);
    return selectedProduct;
  }


}
