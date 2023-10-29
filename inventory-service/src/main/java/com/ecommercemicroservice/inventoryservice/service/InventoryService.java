package com.ecommercemicroservice.inventoryservice.service;

import com.ecommercemicroservice.inventoryservice.repository.InventoryRepository;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean isInStock(List<String> skuCode){
        return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }
}
