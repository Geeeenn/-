package com.example.springboot.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 用户名
     */
    private String username;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    private Date createtime;

    private Date updatetime;

    private static final long serialVersionUID = 1L;
}