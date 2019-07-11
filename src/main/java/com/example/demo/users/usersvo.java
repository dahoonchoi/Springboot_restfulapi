package com.example.demo.users;

public class usersvo{
    private String email;
    private String birth;
    private String address;
    private String phonenum;
    private String name;

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "usersvo [address=" + address + ", birth=" + birth + ", email=" + email + ", name=" + name
                + ", phonenum=" + phonenum + "]";
    }

    public usersvo(String email, String birth, String address, String phonenum, String name) {
        this.email = email;
        this.birth = birth;
        this.address = address;
        this.phonenum = phonenum;
        this.name = name;
    }
    
    

    
}