package com.lanou.model;

import java.math.BigDecimal;
import java.util.List;

public class ShoppingCart {

    private Integer custId;

    private List<TrCart> trCarts;

    private Integer count;

    private String allMoney;

    public String getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(String allMoney) {
        this.allMoney = allMoney;
    }

    public ShoppingCart() {
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public List<TrCart> getTrCarts() {
        return trCarts;
    }

    public void setTrCarts(List<TrCart> trCarts) {
        this.trCarts = trCarts;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "custId=" + custId +
                ", trCarts=" + trCarts +
                ", count=" + count +
                ", allMoney='" + allMoney + '\'' +
                '}';
    }
}
