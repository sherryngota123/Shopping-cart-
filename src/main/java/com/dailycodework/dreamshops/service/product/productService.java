package com.dailycodework.dreamshops.service.product;

import com.dailycodework.dreamshops.exception.productNotFoundException;
import com.dailycodework.dreamshops.model.Product;
import com.dailycodework.dreamshops.repository.productRepository;
import com.dailycodework.dreamshops.service.product.exception.productNotFoundException;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class productService implements IproductService{
    private productRepository productRepository;
    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElse(()-> new productNotFoundException("Product not found"));
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.findById

    }

    @Override
    public void updateProduct(Product product, Long ProductId) {

    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategory(Long category) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductByCategoryAndBrand(String category, String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductByBrandAndCategory(String Brand, String category) {
        return List.of();
    }

    @Override
    public List<Product> getProductByName(String name) {
        return List.of();
    }

    @Override
    public List<Product> getProductByBrandAndName(String brand, String name) {
        return List.of();
    }

    @Override
    public Long countProductByBrandAndName(String brand, String name) {
        return 0;
    }
}
