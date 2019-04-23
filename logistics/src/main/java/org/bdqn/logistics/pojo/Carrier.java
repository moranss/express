package org.bdqn.logistics.pojo;

import java.util.Date;

public class Carrier {
    private Integer id;

    private String carriername;

    private String expresscompanycode;

    private String phone;

    private String remarks;

    private Date addingdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarriername() {
        return carriername;
    }

    public void setCarriername(String carriername) {
        this.carriername = carriername == null ? null : carriername.trim();
    }

    public String getExpresscompanycode() {
        return expresscompanycode;
    }

    public void setExpresscompanycode(String expresscompanycode) {
        this.expresscompanycode = expresscompanycode == null ? null : expresscompanycode.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getAddingdate() {
        return addingdate;
    }

    public void setAddingdate(Date addingdate) {
        this.addingdate = addingdate;
    }
}