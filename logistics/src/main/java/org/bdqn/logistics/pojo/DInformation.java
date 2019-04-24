package org.bdqn.logistics.pojo;

public class DInformation {
    private Integer dId;

    private Double dVolume;

    private Double dOtherExpenses;

    private Double dSupportValue;

    private Integer dRollOutOdd;

    private String dCommonCarrier;

    private Integer dDestinationBranch;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Double getdVolume() {
        return dVolume;
    }

    public void setdVolume(Double dVolume) {
        this.dVolume = dVolume;
    }

    public Double getdOtherExpenses() {
        return dOtherExpenses;
    }

    public void setdOtherExpenses(Double dOtherExpenses) {
        this.dOtherExpenses = dOtherExpenses;
    }

    public Double getdSupportValue() {
        return dSupportValue;
    }

    public void setdSupportValue(Double dSupportValue) {
        this.dSupportValue = dSupportValue;
    }

    public Integer getdRollOutOdd() {
        return dRollOutOdd;
    }

    public void setdRollOutOdd(Integer dRollOutOdd) {
        this.dRollOutOdd = dRollOutOdd;
    }

    public String getdCommonCarrier() {
        return dCommonCarrier;
    }

    public void setdCommonCarrier(String dCommonCarrier) {
        this.dCommonCarrier = dCommonCarrier == null ? null : dCommonCarrier.trim();
    }

    public Integer getdDestinationBranch() {
        return dDestinationBranch;
    }

    public void setdDestinationBranch(Integer dDestinationBranch) {
        this.dDestinationBranch = dDestinationBranch;
    }
}