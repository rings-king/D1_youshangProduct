package com.lanou.model;

public class Ectype {
    private Integer eId;

    private String prodId;

    private String ectId;

    private String ectName;

    private String imgUrl;

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId == null ? null : prodId.trim();
    }

    public String getEctId() {
        return ectId;
    }

    public void setEctId(String ectId) {
        this.ectId = ectId == null ? null : ectId.trim();
    }

    public String getEctName() {
        return ectName;
    }

    public void setEctName(String ectName) {
        this.ectName = ectName == null ? null : ectName.trim();
    }

    public Ectype() {
    }

    @Override
    public String toString() {
        return "Ectype{" +
                "eId=" + eId +
                ", prodId='" + prodId + '\'' +
                ", ectId='" + ectId + '\'' +
                ", ectName='" + ectName + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}