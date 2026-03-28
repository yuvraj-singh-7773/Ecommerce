package com.example.Ecommerce.controller;


import com.example.Ecommerce.dto.FakeStoreCategoryResponseItem;
import com.example.Ecommerce.dto.FakeStoreProductResponseIteam;
import com.example.Ecommerce.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class productController {

    public final IProductService productService;

    @GetMapping("/{id}")
    public FakeStoreProductResponseIteam getProductByIdController(@PathVariable int id) throws IOException {
        return productService.getProductByIdService(id);
    }
}
