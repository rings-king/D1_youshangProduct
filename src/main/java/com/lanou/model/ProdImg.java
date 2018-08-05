package com.lanou.model;

public class ProdImg {
    private Integer imgId;

    private String prodId;

    private String prodImg;

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId == null ? null : prodId.trim();
    }

    public String getProdImg() {
        return prodImg;
    }

    public void setProdImg(String prodImg) {
        this.prodImg = prodImg == null ? null : prodImg.trim();
    }

    public ProdImg() {
    }

    @Override
    public String toString() {
        return "ProdImg{" +
                "imgId=" + imgId +
                ", prodId='" + prodId + '\'' +
                ", prodImg='" + prodImg + '\'' +
                '}';
    }
}