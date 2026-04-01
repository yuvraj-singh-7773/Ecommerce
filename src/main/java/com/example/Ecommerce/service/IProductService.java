package com.example.Ecommerce.service;

import com.example.Ecommerce.dto.FakeStoreCategoryResponseItem;
import com.example.Ecommerce.dto.FakeStoreProductResponseIteam;
import com.example.Ecommerce.dto.ProductDto;
import com.example.Ecommerce.dto.ProductWithCategoryDto;

import java.io.IOException;

public interface IProductService {

    public FakeStoreProductResponseIteam getProductByIdService(int id) throws IOException;

    public ProductDto createProduct(ProductDto productDto) throws IOException;

    ProductWithCategoryDto getProductWithCategory(Long id) throws  Exception;

}
