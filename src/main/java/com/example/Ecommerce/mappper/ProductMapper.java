package com.example.Ecommerce.mappper;

import com.example.Ecommerce.dto.FakeStoreProductResponseIteam;
import com.example.Ecommerce.dto.ProductDto;
import com.example.Ecommerce.dto.ProductWithCategoryDto;
import com.example.Ecommerce.entity.Category;
import com.example.Ecommerce.entity.Product;

public class ProductMapper {


    public static ProductDto toDto(Product product){
        return ProductDto.builder()
                .id(product.getId())
                .image(product.getImage())
                .color(product.getColor())
                .price(product.getPrice())
                .description(product.getDescription())
                .discount(product.getDiscount())
                .model(product.getModel())
                .title(product.getTitle())
                .category(product.getCategory() != null ? product.getCategory().getName() : null)
                .brand(product.getBrand())
                .popular(product.isPopular())
                .build();
    }

    public static Product toEntity(ProductDto dto, Category category) {
        return Product.builder()
                .image(dto.getImage())
                .color(dto.getColor())
                .price(dto.getPrice())
                .description(dto.getDescription())
                .discount(dto.getDiscount())
                .model(dto.getModel())
                .title(dto.getTitle())
                .category(category)
                .brand(dto.getBrand())
                .popular(dto.isPopular())
                .build();
    }

    public static FakeStoreProductResponseIteam toFakeStoreResponseItem(Product product) {
        return FakeStoreProductResponseIteam.builder()
                .id(product.getId() == null ? 0 : product.getId().intValue())
                .title(product.getTitle())
                .price(product.getPrice())
                .description(product.getDescription())
                .category(product.getCategory() != null ? product.getCategory().getName() : null)
                .image(product.getImage())
                .build();
    }
    public static ProductWithCategoryDto toProductWithCategoryDTO(Product product) {
        return ProductWithCategoryDto.builder()
                .id(product.getId())
                .image(product.getImage())
                .color(product.getColor())
                .price(product.getPrice())
                .description(product.getDescription())
                .discount(product.getDiscount())
                .model(product.getModel())
                .title(product.getTitle())
                .brand(product.getBrand())
                .popular(product.isPopular())
                .category(CategoryMapper.toDto(product.getCategory()))
                .build();
    }

}
