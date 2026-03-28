package com.example.Ecommerce.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FakeStoreProductResponseIteam {
	@JsonProperty("id")
	private int id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("price")
	private double price;

	@JsonProperty("description")
	private String description;

	@JsonProperty("category")
	private String category;

	@JsonProperty("image")
	private String image;
}
