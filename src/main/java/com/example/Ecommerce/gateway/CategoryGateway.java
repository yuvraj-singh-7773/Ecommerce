package com.example.Ecommerce.gateway;

import com.example.Ecommerce.dto.CategoryDto;
import com.example.Ecommerce.dto.FakeStoreCategoryResponseItem;
import com.example.Ecommerce.gateway.api.FakeStoreCategory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Component
public class CategoryGateway implements ICategoryGateway{

    private final FakeStoreCategory fakeStoreCategory;

    @Override
    public List<CategoryDto> getAllCategory() throws IOException {
        List<FakeStoreCategoryResponseItem> productList=fakeStoreCategory.getAllFakeCategory().execute().body();

        if(productList==null){
            throw new IOException("Failed to fetch api request");
        }


        List<CategoryDto> categories = productList.stream()
                .map(FakeStoreCategoryResponseItem::getCategory)
                .distinct()
                .map(CategoryDto::new)
                .toList();

        return categories;
    }
}
