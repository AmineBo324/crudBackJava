package com.example.demo.product;

import jakarta.persistence.*;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String nom;
    private String description;
    private Double price;

    public Product() {
    }

    public Product(Long id, String nom, String description, Double prix) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.price = prix;
    }

    public Product(String nom, String description, Double prix) {
        this.nom = nom;
        this.description = description;
        this.price = prix;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double prix) {
        this.price = prix;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", nom=" + nom + ", description=" + description + ", price=" + price;
    }
}
