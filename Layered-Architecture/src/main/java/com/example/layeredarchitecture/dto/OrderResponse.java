package com.example.layeredarchitecture.dto;

import java.math.BigDecimal;

public class OrderResponse {
    private Long id;
    private String product;
    private BigDecimal total;
    
    public OrderResponse(Long id, String product, BigDecimal total) {
        this.id = id;
        this.product = product;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}