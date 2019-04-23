package org.bdqn.logistics.pojo;

public class Warehouse {
    private Integer id;

    private String warehousename;

    private Integer measure;

    private String personincharge;

    private String phone;

    private Integer affiliatednetworkId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWarehousename() {
        return warehousename;
    }

    public void setWarehousename(String warehousename) {
        this.warehousename = warehousename == null ? null : warehousename.trim();
    }

    public Integer getMeasure() {
        return measure;
    }

    public void setMeasure(Integer measure) {
        this.measure = measure;
    }

    public String getPersonincharge() {
        return personincharge;
    }

    public void setPersonincharge(String personincharge) {
        this.personincharge = personincharge == null ? null : personincharge.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getAffiliatednetworkId() {
        return affiliatednetworkId;
    }

    public void setAffiliatednetworkId(Integer affiliatednetworkId) {
        this.affiliatednetworkId = affiliatednetworkId;
    }
}