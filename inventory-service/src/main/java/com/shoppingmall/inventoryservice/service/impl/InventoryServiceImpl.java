package com.shoppingmall.inventoryservice.service.impl;

import com.shoppingmall.inventoryservice.repository.InventoryRepo;
import com.shoppingmall.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    private final InventoryRepo inventoryRepo;
    @Override
    @Transactional(readOnly = true)
    public Boolean isInStock(String skuCode) {
        return inventoryRepo.findBySkuCode(skuCode);
    }
}
