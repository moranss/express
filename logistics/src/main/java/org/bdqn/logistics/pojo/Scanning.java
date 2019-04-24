package org.bdqn.logistics.pojo;

public class Scanning {
    private Integer id;

    private String scanningname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScanningname() {
        return scanningname;
    }

    public void setScanningname(String scanningname) {
        this.scanningname = scanningname == null ? null : scanningname.trim();
    }
}