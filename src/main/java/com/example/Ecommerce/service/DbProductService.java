package com.example.Ecommerce.service;

import com.example.Ecommerce.dto.FakeStoreProductResponseIteam;
import com.example.Ecommerce.dto.ProductDto;
import com.example.Ecommerce.dto.ProductWithCategoryDto;
import com.example.Ecommerce.entity.Category;
import com.example.Ecommerce.entity.Product;
import com.example.Ecommerce.mappper.ProductMapper;
import com.example.Ecommerce.repository.CategoryRepository;
import com.example.Ecommerce.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;

@AllArgsConstructor
@Component("DbSearch")
public class DbProductService implements IProductService{

    public final ProductRepository productRepository;
    public final CategoryRepository categoryRepository;

    @Override
    public FakeStoreProductResponseIteam getProductByIdService(int id) throws IOException {
        long productId = id;
        return productRepository.findById(productId)
                .map(ProductMapper::toFakeStoreResponseItem)
                .orElseThrow(() -> new RuntimeException("product not found"));
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) throws IOException {
        if (productDto.getCategory() == null || productDto.getCategory().isBlank()) {
            throw new IllegalArgumentException("category name is required");
        }
        Category category = categoryRepository.findByName(productDto.getCategory())
                .orElseThrow(() -> new IllegalArgumentException(
                        "category not found: " + productDto.getCategory()));
        Product saved = productRepository.save(ProductMapper.toEntity(productDto, category));
        return ProductMapper.toDto(saved);
    }

    @Override
    public ProductWithCategoryDto getProductWithCategory(Long id) throws Exception {
        Product product=productRepository.findById(id)
                .orElseThrow(() -> new Exception("Product not found"));
        return ProductMapper.toProductWithCategoryDTO(product);
    }
}
