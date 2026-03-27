package com.example.Ecommerce.config;

import com.example.Ecommerce.gateway.api.FakeStoreCategory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {

    @Value("${api.base.url}")
    private String baseUrll;

    @Bean
    public Retrofit retrofit(){
        return new Retrofit.Builder()
                .baseUrl(baseUrll)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakeStoreCategory fakeStoreCategory(Retrofit retrofit){
        return retrofit.create(FakeStoreCategory.class);
    }
}
