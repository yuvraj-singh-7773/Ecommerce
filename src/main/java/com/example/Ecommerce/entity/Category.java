package com.example.Ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true, exclude = "products")
@ToString(exclude = "products")
public class Category extends BaseEntity {

    @Column(nullable = false,unique = false)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

}
