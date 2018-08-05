package com.lanou.model;

public class StoragePrice {
    private Integer id;

    private String prodId;

    private Integer specificationId;

    private String unitPrice;

    private String mkPrice;

    private String vipPrice;

    private String plaPrice;

    private Integer storage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId == null ? null : prodId.trim();
    }

    public Integer getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(Integer specificationId) {
        this.specificationId = specificationId;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice == null ? null : unitPrice.trim();
    }

    public String getMkPrice() {
        return mkPrice;
    }

    public void setMkPrice(String mkPrice) {
        this.mkPrice = mkPrice == null ? null : mkPrice.trim();
    }

    public String getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(String vipPrice) {
        this.vipPrice = vipPrice == null ? null : vipPrice.trim();
    }

    public String getPlaPrice() {
        return plaPrice;
    }

    public void setPlaPrice(String plaPrice) {
        this.plaPrice = plaPrice == null ? null : plaPrice.trim();
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public StoragePrice() {
    }

    @Override
    public String toString() {
        return "StoragePrice{" +
                "id=" + id +
                ", prodId='" + prodId + '\'' +
                ", specificationId=" + specificationId +
                ", unitPrice='" + unitPrice + '\'' +
                ", mkPrice='" + mkPrice + '\'' +
                ", vipPrice='" + vipPrice + '\'' +
                ", plaPrice='" + plaPrice + '\'' +
                ", storage=" + storage +
                '}';
    }
}