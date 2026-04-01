package com.example.Ecommerce.service;

import com.example.Ecommerce.dto.FakeStoreCategoryResponseItem;
import com.example.Ecommerce.dto.FakeStoreProductResponseIteam;
import com.example.Ecommerce.dto.ProductDto;
import com.example.Ecommerce.dto.ProductWithCategoryDto;
import com.example.Ecommerce.gateway.IProductGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
@RequiredArgsConstructor
public class ProductService implements IProductService{


    public final IProductGateway productGateway;

    @Override
    public FakeStoreProductResponseIteam getProductByIdService(int id) throws IOException {
        return productGateway.getProductByIdGateway(id);
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) throws IOException {
        return null;
    }

    @Override
    public ProductWithCategoryDto getProductWithCategory(Long id) throws Exception {
        return null;
    }


}
