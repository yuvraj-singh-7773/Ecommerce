package com.example.Ecommerce.gateway;

import com.example.Ecommerce.dto.FakeStoreCategoryResponseItem;
import com.example.Ecommerce.dto.FakeStoreProductResponseIteam;

import java.io.IOException;

public interface IProductGateway {

    public FakeStoreProductResponseIteam getProductByIdGateway(int id) throws IOException;


}
