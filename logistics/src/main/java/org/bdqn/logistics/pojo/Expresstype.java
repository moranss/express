package org.bdqn.logistics.pojo;

import java.util.Date;

public class Expresstype {
    private Integer id;

    private String expresstypename;

    private String remarks;

    private Date addingdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpresstypename() {
        return expresstypename;
    }

    public void setExpresstypename(String expresstypename) {
        this.expresstypename = expresstypename == null ? null : expresstypename.trim();
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