package com.example.Ecommerce.controller;


import com.example.Ecommerce.dto.AllProductsOfCategoryDto;
import com.example.Ecommerce.dto.CategoryDto;
import com.example.Ecommerce.service.ICategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor

public class CategoryController {

    public final ICategoryService categoryService;

    @GetMapping
    public List<CategoryDto> getAllCategory() throws IOException {
        return categoryService.getAllCategory();
    }
    @PostMapping()
    public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto) throws Exception{
        return ResponseEntity.ok(categoryService.createCategory(categoryDto));
    }
    @GetMapping("/name/{name}")
    public ResponseEntity<CategoryDto> getByName(@PathVariable String name) throws Exception{
        return ResponseEntity.ok(categoryService.getByName(name));
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<AllProductsOfCategoryDto> getByName(@PathVariable Long id) throws Exception{
        return ResponseEntity.ok(categoryService.getAllProductsOfCategory(id));
    }
}
