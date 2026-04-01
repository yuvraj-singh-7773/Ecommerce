package com.example.Ecommerce.dto;

import com.example.Ecommerce.mappper.AllProductsOfCategoryDtoMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AllProductsOfCategoryDto {
    private Long categoryId;
    private String name;
    private List<ProductDto> productDtoList;

}
