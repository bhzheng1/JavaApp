package com.atguigu.block;

public class User {
    private long RegistrationTime;
    private String userName;
    private String password;

    {
        System.out.println("new user register");
        this.RegistrationTime = System.currentTimeMillis();
    }

    public User() {
        this.userName = this.RegistrationTime +"";
        password = "123456";
    }
    public User(String name, String password){
        this.userName = name;
        this.password = password;
    }

    public String getIfno(){
        return "Username: " + this.userName + "\n" + "Password: " + this.password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
