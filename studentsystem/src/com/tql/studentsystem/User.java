package com.tql.studentsystem;

public class User {
    private String username;
    private String password;
    private String IDcode;
    private String phoneNumber;

    public User() {
    }

    public User(String username, String password, String IDcode, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.IDcode = IDcode;
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return IDcode
     */
    public String getIDcode() {
        return IDcode;
    }

    /**
     * 设置 IDcode
     */
    public void setIDcode(String IDcode) {
        this.IDcode = IDcode;
    }

    /**
     * 获取
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置 phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
