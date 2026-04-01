package com.example.Ecommerce.controller;


import com.example.Ecommerce.dto.FakeStoreProductResponseIteam;
import com.example.Ecommerce.dto.ProductDto;
import com.example.Ecommerce.service.IProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/product")
public class productController {

    public final IProductService productService;
    productController(@Qualifier("DbSearch") IProductService productService){
        this.productService=productService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<FakeStoreProductResponseIteam> getProductByIdController(@PathVariable int id) throws IOException {
        return ResponseEntity.ok(productService.getProductByIdService(id));
    }

    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto) throws Exception{
        return ResponseEntity.ok(productService.createProduct(productDto));
    }
}
