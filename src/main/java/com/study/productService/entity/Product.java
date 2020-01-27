package com.study.productService.entity;

import org.springframework.data.annotation.Id;

public class Product {

    @Id
    public String id;

    public String PN;
    public double price;

    public Product() {
    }

    public Product(String PN, double price) {
        this.PN = PN;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPN() {
        return PN;
    }

    public void setPN(String PN) {
        this.PN = PN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(
                "Product[id=%s, Name='%s', Price='%s']",
                id, PN, price);
    }
}
