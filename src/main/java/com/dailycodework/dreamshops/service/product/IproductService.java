package com.dailycodework.dreamshops.service.product;

import com.dailycodework.dreamshops.model.Product;
import java.util.List;
import ...

public interface IproductService {
//    method/functions in the  database and JPA will write for us the queries

    Product addProduct(Product product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    void updateProduct(Product product, Long ProductId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(Long category);

    List<Product> getProductsByCategory(String category);

    List<Product> getProductsByBrand(String brand);
    List<Product> getProductByCategoryAndBrand(String category, String brand);
    List<Product> getProductByBrandAndCategory(String Brand, String category);
    List<Product> getProductByName(String name);
    List<Product> getProductByBrandAndName(String brand, String name);
    Long countProductByBrandAndName(String brand,String name);


}
