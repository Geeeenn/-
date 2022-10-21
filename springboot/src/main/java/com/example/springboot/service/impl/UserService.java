package com.example.springboot.service.impl;

//import com.example.springboot.controller.request.UserPageRequest;
import com.example.springboot.entity.User;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.service.IUserService;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService {

    @Autowired
    UserMapper userMapper;



    @Override
    public List<User> listUsers() {
        return userMapper.listUsers();
    }

//    @Override
//    public Object page(UserPageRequest userPageRequest) {
////        String name = userPageRequest.getName();
////        String phone = userPageRequest.getPhone();
//        //分页
//            PageHelper.startPage(userPageRequest.getPageNum(),userPageRequest.getPageSize());
//            List<User> users = userMapper.listByCondition(userPageRequest);//条件查询
//
////            PageInfo<Users> userPageInfo =  new PageInfo(users);
//            return new PageInfo(users);
    }

