package com.lanou.model;

import java.util.Date;

public class Customer {
    private Integer custId;

    private String custCode;

    private String addr;

    private Date regisDate;

    private String telNo;

    private String sex;

    private String custName;

    private String custLevel;

    private String custSco;

    private String custPaw;

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode == null ? null : custCode.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public Date getRegisDate() {
        return regisDate;
    }

    public void setRegisDate(Date regisDate) {
        this.regisDate = regisDate;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo == null ? null : telNo.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel == null ? null : custLevel.trim();
    }

    public String getCustSco() {
        return custSco;
    }

    public void setCustSco(String custSco) {
        this.custSco = custSco == null ? null : custSco.trim();
    }

    public String getCustPaw() {
        return custPaw;
    }

    public void setCustPaw(String custPaw) {
        this.custPaw = custPaw == null ? null : custPaw.trim();
    }

    public Customer() {
    }
}