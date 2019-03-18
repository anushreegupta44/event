package com.event.management.event.dto;

public class InventoryCountDto {
  private long totalUnsoldInventory;

  public InventoryCountDto(long totalUnsoldInventory) {
    this.totalUnsoldInventory = totalUnsoldInventory;
  }

  public long getTotalUnsoldInventory() {
    return totalUnsoldInventory;
  }

  public void setTotalUnsoldInventory(long totalUnsoldInventory) {
    this.totalUnsoldInventory = totalUnsoldInventory;
  }
}
