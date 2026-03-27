package com.example.Ecommerce.gateway;

import com.example.Ecommerce.dto.CategoryDto;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway{
    public List<CategoryDto> getAllCategory() throws IOException;
}
