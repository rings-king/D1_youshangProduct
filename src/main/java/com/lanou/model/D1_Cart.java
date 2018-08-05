package com.lanou.model;

import java.util.Date;


public class D1_Cart {
    private Integer id;

    private Integer custId;

    private String productId;

    private Integer quantity;

    private Integer checked;

    private String creatTime;

    private String updateTime;

    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getChecked() {
        return checked;
    }

    public void setChecked(Integer checked) {
        this.checked = checked;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public D1_Cart() {
    }

    @Override
    public String toString() {
        return "D1_Cart{" +
                "id=" + id +
                ", custId=" + custId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", checked=" + checked +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", product=" + product +
                '}';
    }
}