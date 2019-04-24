package org.bdqn.logistics.pojo;

import java.util.Date;

public class Problempieces {
    private Integer id;

    private String problemname;

    private String remarks;

    private Date addingdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProblemname() {
        return problemname;
    }

    public void setProblemname(String problemname) {
        this.problemname = problemname == null ? null : problemname.trim();
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