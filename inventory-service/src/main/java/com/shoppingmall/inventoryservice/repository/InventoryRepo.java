package com.shoppingmall.inventoryservice.repository;

import com.shoppingmall.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Long> {
    Boolean findBySkuCode(String skuCode);
}
