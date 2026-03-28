package com.example.Ecommerce.service;

import com.example.Ecommerce.dto.FakeStoreCategoryResponseItem;
import com.example.Ecommerce.dto.FakeStoreProductResponseIteam;

import java.io.IOException;

public interface IProductService {

    public FakeStoreProductResponseIteam getProductByIdService(int id) throws IOException;

}
