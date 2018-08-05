package com.lanou.model;

import java.util.Date;

public class Sale_item extends Sale_itemKey {
    private Long unitPrice;

    private Integer qty;

    private Date orderDate;

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Sale_item() {
    }
}