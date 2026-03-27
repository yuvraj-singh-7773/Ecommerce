package com.example.Ecommerce.service;

import com.example.Ecommerce.dto.CategoryDto;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {
    public List<CategoryDto> getAllCategory() throws IOException;
}
