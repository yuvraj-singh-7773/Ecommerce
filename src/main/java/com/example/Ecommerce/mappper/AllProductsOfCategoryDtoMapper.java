package com.example.Ecommerce.mappper;

import com.example.Ecommerce.dto.AllProductsOfCategoryDto;
import com.example.Ecommerce.dto.ProductDto;
import com.example.Ecommerce.entity.Category;

import java.util.List;

public class AllProductsOfCategoryDtoMapper {
    public static AllProductsOfCategoryDto todto(Category category, List<ProductDto> productDtoList) {
        return AllProductsOfCategoryDto.builder()
                .categoryId(category.getId())
                .name(category.getName())
                .productDtoList(productDtoList)
                .build();
    }
}
