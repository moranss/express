package org.bdqn.logistics.pojo;

import java.util.Date;

public class Shifts {
    private Integer id;

    private String shiftsname;

    private String remarks;

    private Date addingdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShiftsname() {
        return shiftsname;
    }

    public void setShiftsname(String shiftsname) {
        this.shiftsname = shiftsname == null ? null : shiftsname.trim();
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