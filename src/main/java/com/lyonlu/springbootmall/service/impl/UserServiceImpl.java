package com.lyonlu.springbootmall.service.impl;


import com.lyonlu.springbootmall.dao.UserDao;
import com.lyonlu.springbootmall.dto.UserRegisterRequest;
import com.lyonlu.springbootmall.model.User;
import com.lyonlu.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
