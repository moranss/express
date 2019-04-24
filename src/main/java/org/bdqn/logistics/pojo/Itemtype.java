package org.bdqn.logistics.pojo;

import java.util.Date;

public class Itemtype {
    private Integer id;

    private String goodsname;

    private Date addingdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Date getAddingdate() {
        return addingdate;
    }

    public void setAddingdate(Date addingdate) {
        this.addingdate = addingdate;
    }
}