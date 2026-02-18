package com.example;

import java.util.Objects;

public class Product {

    private String id;
    private String name;
    private double price;
    private int stock;

    // Constructor por defecto
    public Product() {
        this.id = "";
        this.name = "";
        this.price = 0.0;
        this.stock = 0;
    }

    // Constructor con validaciones
    public Product(String id, String name, double price, int stock) {

        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("El id no puede estar vacío");
        }

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        if (price < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }

        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }

        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    // Setters
    public void setId(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("El id no puede estar vacío");
        }
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.price = price;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
        this.stock = stock;
    }

    // toString
    public String toString() {
        return "Producto [id=" + id +
                ", name=" + name +
                ", price=" + price +
                ", stock=" + stock + "]";
    }

    // equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return id.equals(product.id);
    }

    // hashCode
    public int hashCode() {
        return Objects.hash(id);
    }
}