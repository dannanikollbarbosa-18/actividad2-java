package com.example;

public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;

//COnstructor por defecto
public Product(){
    this.id = "";
    this.name = "";
    this.price = 0.0;
    this.stock =0;
}
//Constructor pri
public Product(String id, String name, double price, int stock){
    this.id = id;
    this.name = name;
    this.price = price;
    this.stock =stock;
}

//get 
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

//Set

public void setId(String id){
    this.id = id;
}

public void setName(String name){
    this.name = name;
}

public void setPrice(double price){
    if (price >= 0){
    this.price = price;
    } else{
        System.out.println("Error, el precio no puede ser negativo");
    }
}

public void setStock(int stock){
    if(stock >= 0){
        this.stock = stock;
    }else{
        System.out.println("Error, la cantidad no puede ser negativa");
    }
}

public String toString(){
    return "Producto [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
}
}