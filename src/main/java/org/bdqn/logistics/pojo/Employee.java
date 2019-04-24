package org.bdqn.logistics.pojo;

public class Employee {
    private Integer id;

    private String account;

    private String password;

    private String name;

    private String phone1;

    private String phone2;

    private Integer wdid;

    private Integer roleid;

    private Integer jobsid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1 == null ? null : phone1.trim();
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2 == null ? null : phone2.trim();
    }

    public Integer getWdid() {
        return wdid;
    }

    public void setWdid(Integer wdid) {
        this.wdid = wdid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getJobsid() {
        return jobsid;
    }

    public void setJobsid(Integer jobsid) {
        this.jobsid = jobsid;
    }
}