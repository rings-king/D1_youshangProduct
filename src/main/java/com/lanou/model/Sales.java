package com.lanou.model;

import java.util.Date;

public class Sales {
    private Integer orderId;

    private String orderNo;

    private Long totAmt;

    private Date orderDate;

    private String invoiceNo;

    private String orderStatus;

    private Date deliveDate;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Long getTotAmt() {
        return totAmt;
    }

    public void setTotAmt(Long totAmt) {
        this.totAmt = totAmt;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public Date getDeliveDate() {
        return deliveDate;
    }

    public void setDeliveDate(Date deliveDate) {
        this.deliveDate = deliveDate;
    }


    public Sales() {
    }
}