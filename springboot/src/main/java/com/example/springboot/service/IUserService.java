package com.example.springboot.service;

//import com.example.springboot.controller.request.UserPageRequest;
import com.example.springboot.entity.User;

import java.util.List;

public interface IUserService {

    List<User> listUsers();

//    Object page(UserPageRequest userPageRequest);
}

