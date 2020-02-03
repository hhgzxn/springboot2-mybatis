package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<Map> getUserInfo(){
        return userMapper.findUserInfo();
    }

}
