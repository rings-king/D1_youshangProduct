package com.lanou.model;

public class Specification {
    private Integer sfId;

    private String specification;

    public Integer getSfId() {
        return sfId;
    }

    public void setSfId(Integer sfId) {
        this.sfId = sfId;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public Specification() {
    }

    @Override
    public String toString() {
        return "Specification{" +
                "sfId=" + sfId +
                ", specification='" + specification + '\'' +
                '}';
    }
}