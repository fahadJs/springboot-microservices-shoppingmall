package com.shoppingmall.inventoryservice.service;

import com.shoppingmall.inventoryservice.dto.InventoryResponse;

import java.util.List;

public interface InventoryService {
    public List<InventoryResponse> isInStock(List<String> skuCode);
}
