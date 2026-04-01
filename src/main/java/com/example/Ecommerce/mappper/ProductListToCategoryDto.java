package com.example.Ecommerce.mappper;

import com.example.Ecommerce.dto.CategoryDto;
import com.example.Ecommerce.dto.FakeStoreCategoryResponseItem;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;



@Component
@RequiredArgsConstructor
public class ProductListToCategoryDto {
    public static List<CategoryDto> convertToCategoryDto(List<FakeStoreCategoryResponseItem> responseItems){
        return responseItems.stream()
                .map(FakeStoreCategoryResponseItem::getCategory)
                .distinct()
                .map(name -> CategoryDto.builder()
                        .name(name)
                        .build())
                .toList();
    }
}
