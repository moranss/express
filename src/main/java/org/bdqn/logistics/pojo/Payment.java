package org.bdqn.logistics.pojo;

import java.util.Date;

public class Payment {
    private Integer id;

    private String paymenttypename;

    private String remarks;

    private Date addingdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaymenttypename() {
        return paymenttypename;
    }

    public void setPaymenttypename(String paymenttypename) {
        this.paymenttypename = paymenttypename == null ? null : paymenttypename.trim();
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