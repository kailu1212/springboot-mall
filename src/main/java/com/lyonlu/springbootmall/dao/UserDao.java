package com.lyonlu.springbootmall.dao;

import com.lyonlu.springbootmall.dto.UserRegisterRequest;
import com.lyonlu.springbootmall.model.User;

public interface UserDao {

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserByEmail(String email);

    User getUserById(Integer userId);
}
