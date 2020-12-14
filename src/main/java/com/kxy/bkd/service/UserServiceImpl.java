package com.kxy.bkd.service;

import com.kxy.bkd.dao.UserRepository;
import com.kxy.bkd.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//定义比对方发
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password){
        User user = userRepository.findByUsernameAndPassword(username,password);

        return user;
    }
}
