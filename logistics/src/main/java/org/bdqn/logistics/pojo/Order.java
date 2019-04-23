package org.bdqn.logistics.pojo;

import java.util.Date;

public class Order {
    private Integer id;

    private String orderid;

    private Integer number;

    private Double weight;

    private Integer paytype;

    private String sender;

    private String sendphone;

    private String sendaddress;

    private String sendprovince;

    private String sendcity;

    private String senddistrict;

    private String remark;

    private String recipient;

    private String receivecall;

    private String consigneeaddress;

    private String receiptprovince;

    private String receiptcity;

    private String receiptarea;

    private Date createdate;

    private Integer orderstatus;

    private Integer eid;

    private Integer bid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public String getSendphone() {
        return sendphone;
    }

    public void setSendphone(String sendphone) {
        this.sendphone = sendphone == null ? null : sendphone.trim();
    }

    public String getSendaddress() {
        return sendaddress;
    }

    public void setSendaddress(String sendaddress) {
        this.sendaddress = sendaddress == null ? null : sendaddress.trim();
    }

    public String getSendprovince() {
        return sendprovince;
    }

    public void setSendprovince(String sendprovince) {
        this.sendprovince = sendprovince == null ? null : sendprovince.trim();
    }

    public String getSendcity() {
        return sendcity;
    }

    public void setSendcity(String sendcity) {
        this.sendcity = sendcity == null ? null : sendcity.trim();
    }

    public String getSenddistrict() {
        return senddistrict;
    }

    public void setSenddistrict(String senddistrict) {
        this.senddistrict = senddistrict == null ? null : senddistrict.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient == null ? null : recipient.trim();
    }

    public String getReceivecall() {
        return receivecall;
    }

    public void setReceivecall(String receivecall) {
        this.receivecall = receivecall == null ? null : receivecall.trim();
    }

    public String getConsigneeaddress() {
        return consigneeaddress;
    }

    public void setConsigneeaddress(String consigneeaddress) {
        this.consigneeaddress = consigneeaddress == null ? null : consigneeaddress.trim();
    }

    public String getReceiptprovince() {
        return receiptprovince;
    }

    public void setReceiptprovince(String receiptprovince) {
        this.receiptprovince = receiptprovince == null ? null : receiptprovince.trim();
    }

    public String getReceiptcity() {
        return receiptcity;
    }

    public void setReceiptcity(String receiptcity) {
        this.receiptcity = receiptcity == null ? null : receiptcity.trim();
    }

    public String getReceiptarea() {
        return receiptarea;
    }

    public void setReceiptarea(String receiptarea) {
        this.receiptarea = receiptarea == null ? null : receiptarea.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }
}