package com.example.Ecommerce.service;


import com.example.Ecommerce.dto.CategoryDto;
import com.example.Ecommerce.gateway.ICategoryGateway;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CategoryService implements ICategoryService{


    private final ICategoryGateway gateway;

    public CategoryService(
            @Qualifier("retrofitCategory") ICategoryGateway gateway
    ) {
        this.gateway = gateway;
    }

    @Override
    public List<CategoryDto> getAllCategory() throws IOException{
        return gateway.getAllCategory();
    }
}
