package com.lanou.model;

public class Discuss {
    private Integer disId;

    private String disCont;

    private Integer disStar;

    private String proId;

    public Integer getDisId() {
        return disId;
    }

    public void setDisId(Integer disId) {
        this.disId = disId;
    }

    public String getDisCont() {
        return disCont;
    }

    public void setDisCont(String disCont) {
        this.disCont = disCont == null ? null : disCont.trim();
    }

    public Integer getDisStar() {
        return disStar;
    }

    public void setDisStar(Integer disStar) {
        this.disStar = disStar;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId == null ? null : proId.trim();
    }

    public Discuss() {
    }

    @Override
    public String toString() {
        return "Discuss{" +
                "disId=" + disId +
                ", disCont='" + disCont + '\'' +
                ", disStar=" + disStar +
                ", proId='" + proId + '\'' +
                '}';
    }
}