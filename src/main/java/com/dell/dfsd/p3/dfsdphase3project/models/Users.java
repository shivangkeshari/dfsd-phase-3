package com.dell.dfsd.p3.dfsdphase3project.models;

public class Users {

    public String userName;
    public String mailId;
    public String password;
    public long userId;
    public String role;

    public Users() {
    }

    public Users(String userName, String mailId, String password, long userId, String role) {
        this.userName = userName;
        this.mailId = mailId;
        this.password = password;
        this.userId = userId;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
