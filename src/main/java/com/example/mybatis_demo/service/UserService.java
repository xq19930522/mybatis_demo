package com.example.mybatis_demo.service;

import com.example.mybatis_demo.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {


    public List<User> getallUser();
    public User getuserbyId(Integer id);
    int addUser(User user);
    public User getuserbyname(String name);
    public  String  upDatePassword(String name, String password, String newpsw);
    int  deleteUser(Integer id);





}
