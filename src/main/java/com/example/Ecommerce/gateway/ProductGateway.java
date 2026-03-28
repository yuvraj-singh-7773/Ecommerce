package com.example.Ecommerce.gateway;

import com.example.Ecommerce.dto.FakeStoreCategoryResponseItem;
import com.example.Ecommerce.dto.FakeStoreProductResponseIteam;
import com.example.Ecommerce.gateway.api.FakeStoreCategory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class ProductGateway implements IProductGateway{

    public final FakeStoreCategory fakeStoreCategory;

    @Override
    public FakeStoreProductResponseIteam getProductByIdGateway(int id) throws IOException {
        FakeStoreProductResponseIteam responseItem= fakeStoreCategory.getProductById(id).execute().body();
        if(responseItem==null) throw new IOException("Product Not Found");
        return responseItem;
    }

}
