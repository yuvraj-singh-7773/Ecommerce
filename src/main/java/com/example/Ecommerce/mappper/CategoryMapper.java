package com.example.Ecommerce.mappper;


import com.example.Ecommerce.dto.CategoryDto;
import com.example.Ecommerce.entity.Category;

public class CategoryMapper {

    public static CategoryDto toDto(Category entity) {
        return CategoryDto.builder()
                .id(entity.getId().intValue())
                .name(entity.getName())
                .build();
    }

    public static Category toEntity(CategoryDto dto) {
        return Category.builder()
                .name(dto.getName())
                .build();
    }
}