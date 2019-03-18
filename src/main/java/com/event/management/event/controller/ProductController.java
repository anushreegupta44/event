package com.event.management.event.controller;

import com.event.management.event.dto.ProductDto;
import com.event.management.event.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  @Autowired
  ProductService productService;

  @GetMapping("/product/{pid}")
  public ResponseEntity getProductDetails(@PathVariable("pid") Integer productId) {
    ProductDto productDto = productService.getProductById(productId);
    return new ResponseEntity(productDto, HttpStatus.OK);
  }
}
