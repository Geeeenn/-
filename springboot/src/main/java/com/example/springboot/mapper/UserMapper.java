package com.example.springboot.mapper;

//import com.example.springboot.controller.request.UserPageRequest;
import com.example.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> listUsers();

//    @Select("select * from user where name like concat('%',#{name },'%') and phone like concat('%',#{name },'%')")
////            name<list> list();
//    List<User> listByCondition(UserPageRequest userPageRequest);
}
