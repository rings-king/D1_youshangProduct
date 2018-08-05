package com.lanou.model;

public class TrCart {
    private Integer id;

    private Integer custId;

    private String productId;

    private Integer quantity;

    private Integer checked;

    private String creatTime;

    private String updateTime;

    private Integer sfId;

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
        this.productId = productId == null ? null : productId.trim();
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

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getSfId() {
        return sfId;
    }

    public void setSfId(Integer sfId) {
        this.sfId = sfId;
    }

    public TrCart() {
    }

    @Override
    public String toString() {
        return "TrCart{" +
                "id=" + id +
                ", custId=" + custId +
                ", productId='" + productId + '\'' +
                ", quantity=" + quantity +
                ", checked=" + checked +
                ", creatTime='" + creatTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", sfId=" + sfId +
                ", product=" + product +
                '}';
    }
}
