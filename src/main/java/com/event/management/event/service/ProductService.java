package com.event.management.event.service;

import com.event.management.event.dto.ProductDto;
import com.event.management.event.model.Product;
import com.event.management.event.repository.InventoryRepository;
import com.event.management.event.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
  @Autowired
  ProductRepository productRepository;

  @Autowired
  InventoryRepository inventoryRepository;

  public ProductDto getProductById(Integer productId) {
    Optional<Product> product = productRepository.findById(productId);
    if (product.isPresent()) {
      Integer invCountForProduct = inventoryRepository.getInventoriesByProduct_IdAndSoldFalse(productId).size();
      ProductDto productDto = convertProductToProductDto(product.get(), invCountForProduct);
      return productDto;
    } else
      return null;
  }

  private ProductDto convertProductToProductDto(Product product, Integer availableProductQuantity) {
    ProductDto productDto = new ProductDto();
    productDto.setName(product.getName());
    productDto.setDescription(product.getDescription());
    productDto.setCategories(product.getCategories());
    productDto.setAvailableQuantity(availableProductQuantity);
    return productDto;
  }
}

