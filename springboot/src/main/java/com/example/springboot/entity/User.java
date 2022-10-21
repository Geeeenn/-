package com.example.springboot.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class User {
    private Integer id;
    private String name;
    private String username;
    private Integer age;
    private String sex;
    private String phone;
    private String address;
    private Timestamp createtime;
    private Timestamp updatetime;

}
