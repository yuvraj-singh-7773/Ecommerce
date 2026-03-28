package com.example.Ecommerce.gateway.api;
import java.io.IOException;
import java.util.List;
import com.example.Ecommerce.dto.FakeStoreCategoryResponseItem;
import com.example.Ecommerce.dto.FakeStoreProductResponseIteam;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FakeStoreCategory{
    @GET("/products")
    Call<List<FakeStoreCategoryResponseItem>> getAllFakeCategory() throws IOException;

    @GET("/products/{id}")
    Call<FakeStoreProductResponseIteam> getProductById(@Path("id") int id) throws IOException;
}
