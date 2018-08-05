package com.lanou.model;


public class Product implements Comparable<Product>{
    private Integer id;

    private String prodId;

    private String prodName;

    private Integer kindNo;

    private String kindName;

    private Integer parentid;

    private String prodDesc;

    private String prodPp;

    private String unitPrice;

    private String mkPrice;

    private String imgUrl;

    private Integer discussSize;

    private Integer storage;

    private StoragePrice storageprice;

    private Specification specification;

    public StoragePrice getStorageprice() {
        return storageprice;
    }

    public void setStorageprice(StoragePrice storageprice) {
        this.storageprice = storageprice;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public Integer getStorage() { return storage; }

    public void setStorage(Integer storage) { this.storage = storage; }

    public Integer getDiscussSize() { return discussSize; }

    public void setDiscussSize(Integer discussSize) { this.discussSize = discussSize; }

    public String getImgUrl() { return imgUrl; }

    public void setImgUrl(String imgUrl) { this.imgUrl = imgUrl; }

    public String getUnitPrice() { return unitPrice; }

    public void setUnitPrice(String unitPrice) { this.unitPrice = unitPrice; }

    public String getMkPrice() { return mkPrice; }

    public void setMkPrice(String mkPrice) { this.mkPrice = mkPrice; }

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
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
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

    public Product() { }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", prodId='" + prodId + '\'' +
                ", prodName='" + prodName + '\'' +
                ", kindNo=" + kindNo +
                ", kindName='" + kindName + '\'' +
                ", parentid=" + parentid +
                ", prodDesc='" + prodDesc + '\'' +
                ", prodPp='" + prodPp + '\'' +
                ", unitPrice='" + unitPrice + '\'' +
                ", mkPrice='" + mkPrice + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", discussSize=" + discussSize +
                ", storage=" + storage +
                ", storageprice=" + storageprice +
                ", specification=" + specification +
                '}';
    }

    public int compareTo(Product o) {
        String price1 = this.getUnitPrice();
        String price2 = o.getUnitPrice();
        float v = Float.parseFloat(price1);
        float m = Float.parseFloat(price2);
        float vm = v - m;
        int num = 0;
        if (vm > 0) {
            num = 1;
        }else {
            num = -1;
        }
        return (num == 0)? 1 : num;
    }

}