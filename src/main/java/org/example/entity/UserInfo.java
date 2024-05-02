package org.example.entity;

public class UserInfo {
    private int id;

    private String userName;

    private String passWord;

    private String phone;

    private String createDay;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreateDay() {
        return createDay;
    }

    public void setCreateDay(String createDay) {
        this.createDay = createDay;
    }
}
