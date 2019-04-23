package org.bdqn.logistics.pojo;

import java.util.Date;

public class Deliver {
    private Integer qId;

    private String wNumber;

    private String member;

    private String qPerson;

    private String qBranches;

    private String qAdmin;

    private String qSite;

    private Date qTime;

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public String getwNumber() {
        return wNumber;
    }

    public void setwNumber(String wNumber) {
        this.wNumber = wNumber == null ? null : wNumber.trim();
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member == null ? null : member.trim();
    }

    public String getqPerson() {
        return qPerson;
    }

    public void setqPerson(String qPerson) {
        this.qPerson = qPerson == null ? null : qPerson.trim();
    }

    public String getqBranches() {
        return qBranches;
    }

    public void setqBranches(String qBranches) {
        this.qBranches = qBranches == null ? null : qBranches.trim();
    }

    public String getqAdmin() {
        return qAdmin;
    }

    public void setqAdmin(String qAdmin) {
        this.qAdmin = qAdmin == null ? null : qAdmin.trim();
    }

    public String getqSite() {
        return qSite;
    }

    public void setqSite(String qSite) {
        this.qSite = qSite == null ? null : qSite.trim();
    }

    public Date getqTime() {
        return qTime;
    }

    public void setqTime(Date qTime) {
        this.qTime = qTime;
    }
}