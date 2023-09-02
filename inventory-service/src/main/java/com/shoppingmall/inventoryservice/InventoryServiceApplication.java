package com.shoppingmall.inventoryservice;

import com.shoppingmall.inventoryservice.model.Inventory;
import com.shoppingmall.inventoryservice.repository.InventoryRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(InventoryServiceApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner loadData(InventoryRepo inventoryRepo){
//		return args -> {
//			Inventory inventory = new Inventory();
//			inventory.setSkuCode("Redmi_Note_12");
//			inventory.setQuantity(100);
//
//			Inventory inventory1 = new Inventory();
//			inventory1.setSkuCode("Redmi_Note_12_black");
//			inventory1.setQuantity(10);
//
//			inventoryRepo.save(inventory);
//			inventoryRepo.save(inventory1);
//		};
//	}

}
