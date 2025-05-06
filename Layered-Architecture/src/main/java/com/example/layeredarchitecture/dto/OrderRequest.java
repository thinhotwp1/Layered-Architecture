package com.example.layeredarchitecture.dto;

import java.math.BigDecimal;

public class OrderRequest {
    private String product;
    private int quantity;
    private BigDecimal price;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    // Getters and setters
}