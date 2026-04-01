package com.example.Ecommerce.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProductWithCategoryDto {

        private Long id;
        private String image;
        private String color;
        private int price;
        private String description;
        private int discount;
        private String model;
        private String title;
        private String brand;
        private boolean popular;
        private CategoryDto category;
}
