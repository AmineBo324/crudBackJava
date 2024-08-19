package com.example.demo.product;

import com.example.demo.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProduct() {
        return productRepository.findAll();
    }

    public Product createProduct(Product produit) {
        return productRepository.save(produit);
    }

    public Optional<Product> getProductById(long id) {
        return productRepository.findById(id);
    }

    public Optional<Product> updateProduct(long id, Product productDetails) {
        return productRepository.findById(id).map(prod -> {
            prod.setNom(productDetails.getNom());
            prod.setDescription(productDetails.getDescription());
            prod.setPrice(productDetails.getPrice());
            return productRepository.save(prod);
        });
    }

    public boolean deleteProduct(long id) {
        return productRepository.findById(id).map(prod -> {
            productRepository.delete(prod);
            return true;
        }).orElse(false);
    }

}
