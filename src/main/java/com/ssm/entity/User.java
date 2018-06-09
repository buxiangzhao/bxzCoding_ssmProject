package com.ssm.entity;

public class User {
  
    private int id;
	private String age;
    private String userName;

    public User(){  
        super();  
    }  
    public int getId() {  
        return id;  
    }  
    public User setId(int id) {
        this.id = id;
        return this;
    }  
    public String getAge() {  
        return age;  
    }  
    public User setAge(String age) {
        this.age = age;
        return this;
    }  
    public String getUserName() {  
        return userName;  
    }  
    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }  
    public User(int id, String age, String userName) {  
        super();  
        this.id = id;  
        this.age = age;  
        this.userName = userName;  
    }  
} 