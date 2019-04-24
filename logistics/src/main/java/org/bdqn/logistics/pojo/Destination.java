package org.bdqn.logistics.pojo;

import java.util.Date;

public class Destination {
    private Integer id;

    private String name;

    private Integer wdid;

    private String country;

    private String provinces;

    private String city;

    private String thecity;

    private String content;

    private Integer operationwd;

    private Integer operationperson;

    private String purposearea;

    private Date createday;

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

    public Integer getWdid() {
        return wdid;
    }

    public void setWdid(Integer wdid) {
        this.wdid = wdid;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvinces() {
        return provinces;
    }

    public void setProvinces(String provinces) {
        this.provinces = provinces == null ? null : provinces.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getThecity() {
        return thecity;
    }

    public void setThecity(String thecity) {
        this.thecity = thecity == null ? null : thecity.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getOperationwd() {
        return operationwd;
    }

    public void setOperationwd(Integer operationwd) {
        this.operationwd = operationwd;
    }

    public Integer getOperationperson() {
        return operationperson;
    }

    public void setOperationperson(Integer operationperson) {
        this.operationperson = operationperson;
    }

    public String getPurposearea() {
        return purposearea;
    }

    public void setPurposearea(String purposearea) {
        this.purposearea = purposearea == null ? null : purposearea.trim();
    }

    public Date getCreateday() {
        return createday;
    }

    public void setCreateday(Date createday) {
        this.createday = createday;
    }
}