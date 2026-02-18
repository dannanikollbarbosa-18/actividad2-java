package com.example;

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product("1", "Laptop", 1200.00, 10);
        Product p2 = new Product("2", "Smartphone", 800.00, 20);

        System.out.println(p1);
        System.out.println(p2);
    }
}