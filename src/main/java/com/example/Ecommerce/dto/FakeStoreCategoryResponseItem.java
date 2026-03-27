package com.example.Ecommerce.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class FakeStoreCategoryResponseItem {


	private String image;

	private Object price;

	private String description;

	private int id;

	private String title;

	private String category;

}
