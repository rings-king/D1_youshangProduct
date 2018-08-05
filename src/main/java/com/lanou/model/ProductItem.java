package com.lanou.model;

import java.util.List;

public class ProductItem{
    private Integer id;

    private String prodId;

    private String prodName;

    private Integer kindNo;

    private String kindName;

    private Integer parentId;

    private String prodDesc;

    private String prodPp;

    private List<ProdImg> allImg;

    private List<Discuss> allDiscuss;

    private List<Ectype> ectypes;

    private List<Specification> specifications;

    private Integer discussSize;

    private List<StoragePrice> storagePrices;

    private List<String> introduces;

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<Specification> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(List<Specification> specifications) {
        this.specifications = specifications;
    }

    public List<String> getIntroduces() {
        return introduces;
    }

    public void setIntroduces(List<String> introduces) {
        this.introduces = introduces;
    }

    public List<ProdImg> getAllImg() {
        return allImg;
    }

    public void setAllImg(List<ProdImg> allImg) {
        this.allImg = allImg;
    }

    public List<Discuss> getAllDiscuss() {
        return allDiscuss;
    }

    public void setAllDiscuss(List<Discuss> allDiscuss) {
        this.allDiscuss = allDiscuss;
    }

    public List<Ectype> getEctypes() {
        return ectypes;
    }

    public void setEctypes(List<Ectype> ectypes) {
        this.ectypes = ectypes;
    }

    public List<Specification> getSpecification() {
        return specifications;
    }

    public void setSpecification(List<Specification> specifications) {
        this.specifications = specifications;
    }

    public List<StoragePrice> getStoragePrices() {
        return storagePrices;
    }

    public void setStoragePrices(List<StoragePrice> storagePrices) {
        this.storagePrices = storagePrices;
    }

    public Integer getDiscussSize() { return discussSize; }

    public void setDiscussSize(Integer discussSize) { this.discussSize = discussSize; }

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

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    public Integer getKindNo() {
        return kindNo;
    }

    public void setKindNo(Integer kindNo) {
        this.kindNo = kindNo;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName == null ? null : kindName.trim();
    }

    public Integer getParentid() {
        return parentId;
    }

    public void setParentid(Integer parentid) {
        this.parentId = parentid;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc == null ? null : prodDesc.trim();
    }

    public String getProdPp() {
        return prodPp;
    }

    public void setProdPp(String prodPp) {
        this.prodPp = prodPp == null ? null : prodPp.trim();
    }

    public ProductItem() {
    }

    @Override
    public String toString() {
        return "ProductItem{" +
                "id=" + id +
                ", prodId='" + prodId + '\'' +
                ", prodName='" + prodName + '\'' +
                ", kindNo=" + kindNo +
                ", kindName='" + kindName + '\'' +
                ", parentId=" + parentId +
                ", prodDesc='" + prodDesc + '\'' +
                ", prodPp='" + prodPp + '\'' +
                ", allImg=" + allImg +
                ", allDiscuss=" + allDiscuss +
                ", ectypes=" + ectypes +
                ", specifications=" + specifications +
                ", discussSize=" + discussSize +
                ", storagePrices=" + storagePrices +
                '}';
    }
}
