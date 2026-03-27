package com.example.Ecommerce.service;


import com.example.Ecommerce.dto.CategoryDto;
import com.example.Ecommerce.gateway.ICategoryGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService implements ICategoryService{

    private final ICategoryGateway categoryGateway;

    @Override
    public List<CategoryDto> getAllCategory() throws IOException{
        return categoryGateway.getAllCategory();
    }
}
