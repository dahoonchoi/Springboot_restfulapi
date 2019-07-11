package com.example.demo.bookmanager;

public class bookmanagerVO {
    private String managerid;
    private String managerpassword;
    private String auth;

    public String getManagerid() {
        return managerid;
    }

    public void setManagerid(String managerid) {
        this.managerid = managerid;
    }

    public String getManagerpassword() {
        return managerpassword;
    }

    public void setManagerpassword(String managerpassword) {
        this.managerpassword = managerpassword;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    @Override
    public String toString() {
        return "bookmanagerVO [auth=" + auth + ", managerid=" + managerid + ", managerpassword=" + managerpassword
                + "]";
    }

    public bookmanagerVO(String managerid, String managerpassword, String auth) {
        this.managerid = managerid;
        this.managerpassword = managerpassword;
        this.auth = auth;
    }

    

}