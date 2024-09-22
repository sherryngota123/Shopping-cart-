package com.dailycodework.dreamshops.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

//annotations
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//this class is an entity in the database thus the use of this annotation
@Entity

public class Image {
//    set primary key
    @Id
//    primary key is going to be generated.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private String fileType;

    @Lob
    private Blob image;
    private String downloadUrl;

//relationship creation
   @ManyToOne
   @JoinColumn(name= "product_Id")
//means many images belong to one product
//    bring product relationship
    private Product product;
}
