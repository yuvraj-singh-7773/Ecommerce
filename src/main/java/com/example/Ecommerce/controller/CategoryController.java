package com.example.Ecommerce.controller;


import com.example.Ecommerce.dto.CategoryDto;
import com.example.Ecommerce.service.ICategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/categories/")
@AllArgsConstructor

public class CategoryController {

    public final ICategoryService categoryService;

    @GetMapping
    public List<CategoryDto> getAllCategory() throws IOException {
        return categoryService.getAllCategory();
    }

}
