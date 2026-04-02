package com.example.Ecommerce.service;

import com.example.Ecommerce.dto.AllProductsOfCategoryDto;
import com.example.Ecommerce.dto.CategoryDto;
import com.example.Ecommerce.dto.ProductDto;
import com.example.Ecommerce.entity.Category;
import com.example.Ecommerce.exception.CategoryNotFoundException;
import com.example.Ecommerce.mappper.AllProductsOfCategoryDtoMapper;
import com.example.Ecommerce.mappper.CategoryMapper;
import com.example.Ecommerce.mappper.ProductMapper;
import com.example.Ecommerce.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
@Primary
public class DbCategoryService implements ICategoryService{

    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryDto> getAllCategory() throws IOException {
        return categoryRepository.findAll().stream()
                .map(CategoryMapper::toDto)
                .toList();
    }

    @Override
    public CategoryDto createCategory(CategoryDto categoryDTO) {

        Optional<Category> existing = categoryRepository.findByName(categoryDTO.getName());

        if(existing.isPresent()){
            throw new RuntimeException("Category already exists!");
        }

        Category category = CategoryMapper.toEntity(categoryDTO);
        return CategoryMapper.toDto(categoryRepository.save(category));
    }

    @Override
    public CategoryDto getByName(String name) throws Exception {
        Category category=categoryRepository.findByName(name)
                .orElseThrow(()->new CategoryNotFoundException("Category not found"));
        return CategoryMapper.toDto(category);
    }

    @Override
    public AllProductsOfCategoryDto getAllProductsOfCategory(Long categoryId) throws Exception {
        Category category=categoryRepository.findById(categoryId)
                .orElseThrow(()->new CategoryNotFoundException("Category not found with id: " + categoryId));

        List<ProductDto> productDtoList=category.getProducts()
                .stream()
                .map(ProductMapper::toDto)
                .toList();
        return AllProductsOfCategoryDtoMapper.todto(category,productDtoList);

    }
}
