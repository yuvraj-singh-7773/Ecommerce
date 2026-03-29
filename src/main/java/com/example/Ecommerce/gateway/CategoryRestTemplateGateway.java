package com.example.Ecommerce.gateway;

import com.example.Ecommerce.dto.CategoryDto;
import com.example.Ecommerce.dto.FakeStoreCategoryResponseItem;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.example.Ecommerce.mappper.ProductListToCategoryDto;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
@Component
@Primary
@RequiredArgsConstructor
public class CategoryRestTemplateGateway implements ICategoryGateway{

    private final RestTemplate restTemplate;
    private final ProductListToCategoryDto categoryDtoMapper;

    @Override
    public List<CategoryDto> getAllCategory() throws IOException {
        String url = "https://fakestoreapi.com/products";
        System.out.println("RestTemplate gateway is used");
        FakeStoreCategoryResponseItem[] responseItems=restTemplate.getForObject(url,FakeStoreCategoryResponseItem[].class);
        List<FakeStoreCategoryResponseItem> productList= Arrays.asList(responseItems);
        if(productList==null){
            throw new IOException("Failed to fetch api request");
        }

        return categoryDtoMapper.convertToCategoryDto(productList);
        
    }
}
