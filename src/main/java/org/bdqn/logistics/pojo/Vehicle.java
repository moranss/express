package org.bdqn.logistics.pojo;

public class Vehicle {
    private Integer id;

    private String vehiclenumber;

    private String licenseplatenumber;

    private String typename;

    private String fleet;

    private Integer netweight;

    private Integer kgfuelconsumption;

    private Integer authorizedload;

    private String vehicleowner;

    private String driver;

    private String phone;

    private Integer affiliatednetworkId;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVehiclenumber() {
        return vehiclenumber;
    }

    public void setVehiclenumber(String vehiclenumber) {
        this.vehiclenumber = vehiclenumber == null ? null : vehiclenumber.trim();
    }

    public String getLicenseplatenumber() {
        return licenseplatenumber;
    }

    public void setLicenseplatenumber(String licenseplatenumber) {
        this.licenseplatenumber = licenseplatenumber == null ? null : licenseplatenumber.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getFleet() {
        return fleet;
    }

    public void setFleet(String fleet) {
        this.fleet = fleet == null ? null : fleet.trim();
    }

    public Integer getNetweight() {
        return netweight;
    }

    public void setNetweight(Integer netweight) {
        this.netweight = netweight;
    }

    public Integer getKgfuelconsumption() {
        return kgfuelconsumption;
    }

    public void setKgfuelconsumption(Integer kgfuelconsumption) {
        this.kgfuelconsumption = kgfuelconsumption;
    }

    public Integer getAuthorizedload() {
        return authorizedload;
    }

    public void setAuthorizedload(Integer authorizedload) {
        this.authorizedload = authorizedload;
    }

    public String getVehicleowner() {
        return vehicleowner;
    }

    public void setVehicleowner(String vehicleowner) {
        this.vehicleowner = vehicleowner == null ? null : vehicleowner.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}