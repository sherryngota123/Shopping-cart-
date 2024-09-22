package com.dailycodework.dreamshops.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Product {
//what our product class will contain
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;

    private BigDecimal price;
    private Integer inventory;
    private String description;


//    making relationships now,use cascade... because when a product is deleted the relationship between the product and category will be deleted .
    @ManyToOne(cascade = CascadeType.ALL)
//    column to join them together
    @JoinColumn(name = "category_Id")
    private Category category;


//    One product many images,orphan removal to true means that when a product is deleted all the images associated is going to be deleted along
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true )
//    list of images since our product will contain images
    private List<Image>  images;
//    so our product class will have relationship with image class and category
}
