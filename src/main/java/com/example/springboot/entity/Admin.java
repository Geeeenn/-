package com.example.springboot.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * admin
 * @author 
 */
@Data
public class Admin implements Serializable {
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    private Date createtime;

    private Date updatetime;

    /**
     * 密码
     */
    private String password;

    private static final long serialVersionUID = 1L;
}