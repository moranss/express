package org.bdqn.logistics.pojo;

import java.util.Date;

public class Outlibrary {
    private Integer id;

    private String outboundcode;

    private Integer warehouseid;

    private Integer itemid;

    private Integer quantity;

    private Integer customerid;

    private Date time;

    private Integer scanningid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOutboundcode() {
        return outboundcode;
    }

    public void setOutboundcode(String outboundcode) {
        this.outboundcode = outboundcode == null ? null : outboundcode.trim();
    }

    public Integer getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getScanningid() {
        return scanningid;
    }

    public void setScanningid(Integer scanningid) {
        this.scanningid = scanningid;
    }
}