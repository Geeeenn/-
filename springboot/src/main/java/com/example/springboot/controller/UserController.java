package com.example.springboot.controller;


//import com.example.springboot.common.Result;
//import com.example.springboot.controller.request.BaseRequest;
//import com.example.springboot.controller.request.UserPageRequest;
import com.example.springboot.entity.User;
import com.example.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/list")
    public List<User> listUsers(){
        return userService.listUsers();

    }



    //分页模糊查询
//    @GetMapping("/page")
//    public Result page(UserPageRequest userPageRequest){
//
//        return Result.success(userService.page(userPageRequest));
//
//    }
}

