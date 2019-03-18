package com.event.management.event.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Inventory {
  @Id
  private String sku;

  @ManyToOne
//  @JoinColumn(name = "xyz")
  private Product product;

  private Boolean sold;


}
