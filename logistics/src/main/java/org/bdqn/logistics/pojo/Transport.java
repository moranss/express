package org.bdqn.logistics.pojo;

import java.util.Date;

public class Transport {
    private Integer id;

    private String name;

    private String remarks;

    private Date addingdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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