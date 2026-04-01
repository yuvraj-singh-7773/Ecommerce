package com.example.Ecommerce.service;

import com.example.Ecommerce.dto.AllProductsOfCategoryDto;
import com.example.Ecommerce.dto.CategoryDto;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {
    public List<CategoryDto> getAllCategory() throws IOException;
    CategoryDto createCategory(CategoryDto categoryDTO);
    CategoryDto getByName(String name) throws Exception;
    AllProductsOfCategoryDto getAllProductsOfCategory(Long categoryId) throws Exception;
}
