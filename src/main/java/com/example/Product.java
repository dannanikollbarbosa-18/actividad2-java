package com.example;

public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;


public Product(){
    this.id = "";
    this.name = "";
    this.price = 0.0;
    this.stock =0;
}

public Product(String id, String name, double price, int stock){
    this.id = id;
    this.name = name;
    this.price = price;
    this.stock =stock;
}

 
public String getId(){
    return id;
}

public String getName(){
    return name;
}

public double getPrice(){
    return price;
}

public int getStock(){
    return stock;
}



public void setId(String id){
    this.id = id;
}

public void setName(String name){
    this.name = name;
}

public void setPrice(double price){
    if (price < 0){
        throw new IllegalArgumentException("El precio no puede ser negativo");
    }
    this.price = price;
}

public void setStock(int stock){
    if (stock < 0){
        throw new IllegalArgumentException("El precio no puede ser negativo");
    }
    this.stock = stock;
}

public String toString(){
    return "Producto [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
}
}